package test_0910;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SelectBox extends JFrame implements ActionListener {
    private JComboBox<String> productComboBox;
    private JTextArea infoTextArea;

    public SelectBox() {
        setTitle("商品选择");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 创建商品选择框
        String[] products = {"苹果", "香蕉", "橙子"};
        productComboBox = new JComboBox<>(products);
        productComboBox.addActionListener(this);

        productComboBox.setSize(200,100);
        // 创建信息显示区域
        infoTextArea = new JTextArea();
        infoTextArea.setEditable(false);

        // 创建容器并添加组件
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(productComboBox, BorderLayout.NORTH);
        c.add(new JScrollPane(infoTextArea), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        JComboBox<String> combo = (JComboBox<String>) e.getSource();
        String selectedProduct = (String) combo.getSelectedItem();

        // 根据选择的商品更新信息显示区域
        String info = getProductInfo(selectedProduct);
        infoTextArea.setText(info);
    }

    private String getProductInfo(String product) {
        // 在这里根据商品名称查询数据库或其他数据源获取商品信息
        String price = "";
        String origin = "";

        // 这里只是一个演示，实际会根据实际情况进行处理
        if (product.equals("苹果")) {
            price = "￥5.00/kg";
            origin = "中国";
        } else if (product.equals("香蕉")) {
            price = "￥3.50/kg";
            origin = "菲律宾";
        } else if (product.equals("橙子")) {
            price = "￥4.00/kg";
            origin = "美国";
        }

        return "单价：" + price + "\n产地：" + origin;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SelectBox().setVisible(true);
            }
        });
    }
}
