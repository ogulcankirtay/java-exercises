package javaapplication47;

import java.util.*;

public class MazeSolver {

    public static final char wallChar = '#';
    public static final char startChar = 's';
    public static final char endChar = 'e';
    public static final char emptyChar = '.';

    public static final char horizontalPathChar = '-';

    private static int[] dC = {1, 0, -1, 0};
    private static int[] dR = {0, 1, 0, -1};

    public static ArrayList<Point> dijkstraSolve(char[][] maze, Point start, Point end) {
        HashMap<Point, Integer> dist = new HashMap<Point, Integer>();
        dist.put(start, 0);

        HashMap<Point, Point> prev = new HashMap<Point, Point>();
        prev.put(start, null);

        PriorityQueue<Point> queue = new PriorityQueue<Point>(new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (!dist.containsKey(p1)) {
                    dist.put(p1, Integer.MAX_VALUE);
                }

                if (!dist.containsKey(p2)) {
                    dist.put(p2, Integer.MAX_VALUE);
                }

                return dist.get(p1) - dist.get(p2);
            }
        });
        queue.offer(start);

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            if (dist.get(p) == Integer.MAX_VALUE) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                Point next = new Point(p.r + dR[i], p.c + dC[i]);

                if (!dist.containsKey(next)) {
                    dist.put(next, Integer.MAX_VALUE);
                }

                if (next.pointOutside(maze[0].length, maze.length) || maze[next.r][next.c] == wallChar) {
                    continue;
                }

                if (dist.get(p) + p.distTo(next) < dist.get(next)) {
                    dist.put(next, dist.get(p) + p.distTo(next));

                    if (!prev.containsKey(next)) {
                        queue.offer(next);
                    }

                    prev.put(next, p);
                }
            }
        }

        ArrayList<Point> result = new ArrayList<Point>();
        Point curr = end;
        while (curr != null) {
            result.add(curr);
            curr = prev.get(curr);
        }

        Collections.reverse(result);

        return result.size() < 2 ? null : result;
    }

}
