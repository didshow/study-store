package dataframe.linearlist;

public class Maze {
    final int LENGTH = 10;                     //迷宫大小
    private Cell CELLS[][];                   //迷宫的数据域

    /*迷宫单元的数据结构*/
    private class Cell {
        private int x;                         //单元所在行
        private int y;                         //单元所在列
        private boolean visited = false;       //单元是否已被访问
        private char mark;                     //单元格的类型,1表示墙,0表示路,*表示可行路径

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public char getMark() {
            return mark;
        }

        public void setMark(char mark) {
            this.mark = mark;
        }
    }

    /**
     * @param maze 传入表示迷宫的二维数组
     * @throws
     * @explain createMaze方法: 创建迷宫
     */
    public void create(char maze[][]) {
        /*为迷宫的数据域分配空间*/
        CELLS = new Cell[LENGTH][LENGTH];

        /*将二维数组类型转换为迷宫*/
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                /*获取数组元素*/
                Cell cell = new Cell();
                /*初始化该迷宫元素*/
                char c = maze[i][j];
                /*将二维数组元素转换为迷宫元素*/
                if (c == '1') {
                    cell.setMark('1');                         //设置标识位1
                } else if (c == '0') {
                    cell.setMark('0');                         //设置标识为0
                }
                cell.setX(i);                                  //设置横坐标
                cell.setY(j);                                  //设置纵坐标
                cell.setVisited(false);                         //设置访问标识

                /*将该元素放入迷宫对应位置*/
                CELLS[i][j] = cell;
            }
        }
    }

    /**
     * @throws
     * @explain print方法: 打印迷宫
     */
    public void print() {
        /*遍历整个迷宫的数据域*/
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                /*打印该迷宫单元的标识*/
                System.out.print(CELLS[i][j].getMark() + " ");
            }
            System.out.println();
        }
    }

    public Cell[][] getCELLS() {
        return CELLS;
    }

    /**
     * @param maze 要寻路迷宫
     * @param sx   起点的横坐标
     * @param sy   起点的纵坐标
     * @param ex   终点的横坐标
     * @param ey   终点的纵坐标
     * @return boolean 起点到终点间是否存在路径，若存在返回true，不存在返回false
     * @throws
     * @explain findPath方法: 计算迷宫起点到终点的路径
     */
    private static boolean findPath(Maze maze, int sx, int sy, int ex, int ey) {
        boolean flag = false;
        /*获取迷宫的数据域*/
        Cell[][] cells = maze.getCELLS();
        /*初始化辅助栈*/
        ArrayStack stack = new ArrayStack(50);
        /*获取起点与终点*/
        Cell startCell = cells[sx][sy];
        Cell endCell = cells[ex][ey];
        /*将起点加入栈中*/
        stack.push(startCell);
        startCell.setVisited(true);                     //设置起点已被访问
        /*穷举出所有情况*/
        while (!stack.isEmpty()) {
            /*查看栈顶元素，若其是终点，则顺序将所访问的节点标识制为* */
            Cell curCell = (Cell) stack.peek();
            if (curCell == endCell) {
                while (!stack.isEmpty()) {
                    Cell cell = (Cell) stack.pop();
                    cell.setMark('*');
                }
                flag = true;
            } else {
                /*获取该点的横坐标和纵坐标*/
                int x = curCell.getX();
                int y = curCell.getY();
                /*若栈顶元素不为终点,判断上下左右位置是否合法，若合法压入栈*/
                if (cells[x + 1][y].getMark() == '0' && cells[x + 1][y].isVisited() == false) {           //右边
                    stack.push(cells[x + 1][y]);
                    cells[x + 1][y].setVisited(true);
                } else if (cells[x][y + 1].getMark() == '0' && cells[x][y + 1].isVisited() == false) {     //下边
                    stack.push(cells[x][y + 1]);
                    cells[x][y + 1].setVisited(true);
                } else if (cells[x - 1][y].getMark() == '0' && cells[x - 1][y].isVisited() == false) {     //左边
                    stack.push(cells[x - 1][y]);
                    cells[x - 1][y].setVisited(true);
                } else if (cells[x][y - 1].getMark() == '0' && cells[x][y - 1].isVisited() == false) {
                    stack.push(cells[x][y - 1]);                                                      //上边
                    cells[x][y - 1].setVisited(true);
                } else {
                    stack.pop();                                                                   //若为死路则退栈
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        /*初始化迷宫的二维数组*/
        char[][] mazearr = {
                {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '0', '1', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '0', '0', '0', '1', '1', '0', '0', '1'},
                {'1', '0', '1', '1', '1', '0', '0', '0', '0', '1'},
                {'1', '0', '0', '0', '1', '0', '0', '0', '0', '1'},
                {'1', '0', '1', '0', '0', '0', '1', '0', '0', '1'},
                {'1', '0', '1', '1', '1', '0', '1', '1', '0', '1'},
                {'1', '1', '0', '0', '0', '0', '0', '0', '0', '1'},
                {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1'}};

        /*初始化迷宫*/
        Maze maze = new Maze();
        maze.create(mazearr);
        System.out.println("迷宫初始状态：");
        maze.print();
        /*计算从起点到终点的路径*/
        boolean flag = findPath(maze, 1, 1, 8, 8);
        if (flag) {
            System.out.println("路径已找到，如下：");
            maze.print();
        } else {
            System.out.println("起点与终点之间没有可达路径");
            maze.print();
        }

    }
}
