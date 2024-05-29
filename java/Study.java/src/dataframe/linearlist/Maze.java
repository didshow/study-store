package dataframe.linearlist;

public class Maze {
    final int LENGTH = 10;                     //�Թ���С
    private Cell CELLS[][];                   //�Թ���������

    /*�Թ���Ԫ�����ݽṹ*/
    private class Cell {
        private int x;                         //��Ԫ������
        private int y;                         //��Ԫ������
        private boolean visited = false;       //��Ԫ�Ƿ��ѱ�����
        private char mark;                     //��Ԫ�������,1��ʾǽ,0��ʾ·,*��ʾ����·��

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
     * @param maze �����ʾ�Թ��Ķ�ά����
     * @throws
     * @explain createMaze����: �����Թ�
     */
    public void create(char maze[][]) {
        /*Ϊ�Թ������������ռ�*/
        CELLS = new Cell[LENGTH][LENGTH];

        /*����ά��������ת��Ϊ�Թ�*/
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                /*��ȡ����Ԫ��*/
                Cell cell = new Cell();
                /*��ʼ�����Թ�Ԫ��*/
                char c = maze[i][j];
                /*����ά����Ԫ��ת��Ϊ�Թ�Ԫ��*/
                if (c == '1') {
                    cell.setMark('1');                         //���ñ�ʶλ1
                } else if (c == '0') {
                    cell.setMark('0');                         //���ñ�ʶΪ0
                }
                cell.setX(i);                                  //���ú�����
                cell.setY(j);                                  //����������
                cell.setVisited(false);                         //���÷��ʱ�ʶ

                /*����Ԫ�ط����Թ���Ӧλ��*/
                CELLS[i][j] = cell;
            }
        }
    }

    /**
     * @throws
     * @explain print����: ��ӡ�Թ�
     */
    public void print() {
        /*���������Թ���������*/
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                /*��ӡ���Թ���Ԫ�ı�ʶ*/
                System.out.print(CELLS[i][j].getMark() + " ");
            }
            System.out.println();
        }
    }

    public Cell[][] getCELLS() {
        return CELLS;
    }

    /**
     * @param maze ҪѰ·�Թ�
     * @param sx   ���ĺ�����
     * @param sy   ����������
     * @param ex   �յ�ĺ�����
     * @param ey   �յ��������
     * @return boolean ��㵽�յ���Ƿ����·���������ڷ���true�������ڷ���false
     * @throws
     * @explain findPath����: �����Թ���㵽�յ��·��
     */
    private static boolean findPath(Maze maze, int sx, int sy, int ex, int ey) {
        boolean flag = false;
        /*��ȡ�Թ���������*/
        Cell[][] cells = maze.getCELLS();
        /*��ʼ������ջ*/
        ArrayStack stack = new ArrayStack(50);
        /*��ȡ������յ�*/
        Cell startCell = cells[sx][sy];
        Cell endCell = cells[ex][ey];
        /*��������ջ��*/
        stack.push(startCell);
        startCell.setVisited(true);                     //��������ѱ�����
        /*��ٳ��������*/
        while (!stack.isEmpty()) {
            /*�鿴ջ��Ԫ�أ��������յ㣬��˳�������ʵĽڵ��ʶ��Ϊ* */
            Cell curCell = (Cell) stack.peek();
            if (curCell == endCell) {
                while (!stack.isEmpty()) {
                    Cell cell = (Cell) stack.pop();
                    cell.setMark('*');
                }
                flag = true;
            } else {
                /*��ȡ�õ�ĺ������������*/
                int x = curCell.getX();
                int y = curCell.getY();
                /*��ջ��Ԫ�ز�Ϊ�յ�,�ж���������λ���Ƿ�Ϸ������Ϸ�ѹ��ջ*/
                if (cells[x + 1][y].getMark() == '0' && cells[x + 1][y].isVisited() == false) {           //�ұ�
                    stack.push(cells[x + 1][y]);
                    cells[x + 1][y].setVisited(true);
                } else if (cells[x][y + 1].getMark() == '0' && cells[x][y + 1].isVisited() == false) {     //�±�
                    stack.push(cells[x][y + 1]);
                    cells[x][y + 1].setVisited(true);
                } else if (cells[x - 1][y].getMark() == '0' && cells[x - 1][y].isVisited() == false) {     //���
                    stack.push(cells[x - 1][y]);
                    cells[x - 1][y].setVisited(true);
                } else if (cells[x][y - 1].getMark() == '0' && cells[x][y - 1].isVisited() == false) {
                    stack.push(cells[x][y - 1]);                                                      //�ϱ�
                    cells[x][y - 1].setVisited(true);
                } else {
                    stack.pop();                                                                   //��Ϊ��·����ջ
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        /*��ʼ���Թ��Ķ�ά����*/
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

        /*��ʼ���Թ�*/
        Maze maze = new Maze();
        maze.create(mazearr);
        System.out.println("�Թ���ʼ״̬��");
        maze.print();
        /*�������㵽�յ��·��*/
        boolean flag = findPath(maze, 1, 1, 8, 8);
        if (flag) {
            System.out.println("·�����ҵ������£�");
            maze.print();
        } else {
            System.out.println("������յ�֮��û�пɴ�·��");
            maze.print();
        }

    }
}
