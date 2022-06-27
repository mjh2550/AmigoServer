package com.spring.amigo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class codetest {
    /*
     * 2022-06-18
     * 미로 탐색 (BFS - 너비 우선 탐색)
     * @Author 문호환 (Main)
     * @return
     */
    static int[][] map; // 기본 행렬
    static int n,m; // 행,렬
    static boolean[][] arrived; // 방문 체크 여부
    static int[] dx = {1,0,-1,0}; // x축
    static int[] dy = {0,1,0,-1}; // y축

    public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        arrived = new boolean[n][m];
        arrived[0][0] = true;

        // 행렬 구조 생성
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        search(0, 0);
        System.out.println(map [n-1][m-1]);
    }

    /*
     * 2022-06-18
     * 행렬 체크
     * @Author 문호환
     * @param x, y
     * @return
     */

    public static void search(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});

        while(!queue.isEmpty()) {
            int[] xy = queue.poll();

            for(int i=0; i<4; i++) {
                int nextX = xy[0]+dx[i];
                int nextY = xy[1]+dy[i];

                if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || arrived[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }
                queue.add(new int[] {nextX, nextY});
                arrived[nextX][nextY] = true;
                map[nextX][nextY] = map[xy[0]][xy[1]] + 1;
            }
        }
    }
}
