package problem_015;

import util.Problem;

public class Problem_015 implements Problem {
  private int MAX_SIZE = 20;

  private long path(int w, int h) {
    // 走出了方格
    if (h < 0 || w < 0)
      return 0;

    // 方格边缘
    if (h == 0 || w == 0)
      return 1;

    // 1 x 1的方格，两条路径
    if (h == 1 && w == 1)
      return 2;

    else
      return path(w - 1, h) + path(w, h - 1);
  }

  private long path(int size) {
    int cycle = 1, i = 1;
    long[][] path_num = new long[MAX_SIZE + 1][MAX_SIZE + 1];

    path_num[0][0] = 1;

    // 从(0,0)点向外，一圈一圈的算
    for (cycle = 1; cycle <= size; cycle++) {
      System.out.printf("\ncycle=%d-------\n", cycle);

      // 竖着的一列
      path_num[cycle][0] = 1; // 边缘地
      for (i = 1; i <= cycle; i++) {
        path_num[cycle][i] = path_num[cycle - 1][i] + path_num[cycle][i - 1];
        // printf("path_num[%d][%d] = %I64d\n",cycle,i,path_num[cycle][i]);
      }
      // 横着的一行
      path_num[0][cycle] = 1; // 边缘地
      for (i = 1; i <= cycle; i++) {
        path_num[i][cycle] = path_num[i - 1][cycle] + path_num[i][cycle - 1];
        // printf("path_num[%d][%d] = %I64d\n",i,cycle,path_num[i][cycle]);
      }
    }

    return path_num[size][size];
  }

  @Override
  public String run() {
    return String.valueOf(path(20));
  }
}
