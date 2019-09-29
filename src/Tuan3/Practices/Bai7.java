package Practices;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Bai7 extends javax.swing.JFrame {

    public Bai7() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTT = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnToSoChan = new javax.swing.JButton();
        btnToLe = new javax.swing.JButton();
        btnSoNguyenTo = new javax.swing.JButton();
        btnBoToDen = new javax.swing.JButton();
        btnXoaGTToDen = new javax.swing.JButton();
        btnTongGiaTri = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnNhap = new javax.swing.JButton();
        txtNhap = new javax.swing.JTextField();
        ckbChoNhapSoAm = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstThongTin = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lblTT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTT.setText("Thao tác trên JList - CheckBox");
        jPanel2.add(lblTT);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0))));

        btnThoat.setText("Đóng chương trình");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel3.add(btnThoat);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Chọn tác vụ"));

        btnToSoChan.setText("Tô đen số chẵn");
        btnToSoChan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToSoChanActionPerformed(evt);
            }
        });

        btnToLe.setText("Tô đen số lẻ");

        btnSoNguyenTo.setText("Tô đen số nguyên tố");

        btnBoToDen.setText("Bỏ tô đen");

        btnXoaGTToDen.setText("Xóa các giá trị đang tô đen");

        btnTongGiaTri.setText("Tổng các giá trị trong JList");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnToSoChan)
                    .addComponent(btnToLe)
                    .addComponent(btnSoNguyenTo)
                    .addComponent(btnXoaGTToDen)
                    .addComponent(btnTongGiaTri)
                    .addComponent(btnBoToDen))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnToSoChan)
                .addGap(18, 18, 18)
                .addComponent(btnToLe)
                .addGap(18, 18, 18)
                .addComponent(btnSoNguyenTo)
                .addGap(18, 18, 18)
                .addComponent(btnBoToDen)
                .addGap(18, 18, 18)
                .addComponent(btnXoaGTToDen)
                .addGap(18, 18, 18)
                .addComponent(btnTongGiaTri)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Nhập thông tin"));

        btnNhap.setText("Nhập");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        ckbChoNhapSoAm.setText("Cho nhập số âm");

        jScrollPane1.setViewportView(LstThongTin);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnNhap)
                .addGap(27, 27, 27)
                .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ckbChoNhapSoAm))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhap)
                    .addComponent(txtNhap)
                    .addComponent(ckbChoNhapSoAm))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
DefaultListModel dlm = new DefaultListModel();
    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {
       int a;
        boolean kk = true;
        String sa = txtNhap.getText();
        if (ckbChoNhapSoAm.isSelected()) {
            kk = true;
        } else {
            kk = false;
        }

        try {
            a = Integer.parseInt(sa);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Nhập sai rồi");
            txtNhap.requestFocus();
            return;
        }
        if (a < 0) {
            if (kk == false) {

                JOptionPane.showMessageDialog(null, "Không thể nhập số âm");
                txtNhap.requestFocus();
                return;
            } else {
                LstThongTin.setModel(dlm);
                dlm.addElement(sa);
                txtNhap.setText("");
            }
        } else {
            LstThongTin.setModel(dlm);
            dlm.addElement(sa);
            txtNhap.setText("");
        }    
    }

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {
    int k = JOptionPane.showConfirmDialog(null, "Bạn muốn thoát?", "Thoát!!!", JOptionPane.YES_NO_OPTION);
        if (k == JOptionPane.YES_OPTION)
            System.exit(0);    
    }
    private DefaultListModel<Integer> model;
    private void btnToSoChanActionPerformed(java.awt.event.ActionEvent evt) {
     model = new DefaultListModel<Integer>();
        ArrayList<Integer> m = new ArrayList<Integer>();
        int[] mSelected;
        for (int i=0; i<model.getSize(); i++)
        {
            if((model.getElementAt(i) % 2) == 0)
                m.add(i);
        }
        mSelected = convertIntegers(m);
        LstThongTin.setSelectedIndices(mSelected);  
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai7().setVisible(true);
            }
        });
    }


    private javax.swing.JList<String> LstThongTin;
    private javax.swing.JButton btnBoToDen;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnSoNguyenTo;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnToLe;
    private javax.swing.JButton btnToSoChan;
    private javax.swing.JButton btnTongGiaTri;
    private javax.swing.JButton btnXoaGTToDen;
    private javax.swing.JCheckBox ckbChoNhapSoAm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTT;
    private javax.swing.JTextField txtNhap;

    
public  static int[] convertIntegers(ArrayList<Integer> integers) {
       int[] ret = new  int[integers.size()];
       for (int i = 0; i < ret.length ; i++){
           ret[i] = integers.get(i).intValue();
       }
       return ret;
    }
}