
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

//User list with GUI by Gustavs Freimanis
public class GUI_JAVA extends javax.swing.JFrame {

    public GUI_JAVA() {
        initComponents();
        startUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUserInput = new javax.swing.JTextPane();
        btnAddUser = new javax.swing.JButton();
        paneUserList = new javax.swing.JScrollPane();
        listUserL = new javax.swing.JList<>();
        btnRemoveUser = new javax.swing.JButton();
        spnCount = new javax.swing.JSpinner();
        btnExit = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jScrollPane1.setViewportView(txtUserInput);

        btnAddUser.setText("Add");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        paneUserList.setViewportView(listUserL);

        btnRemoveUser.setText("Remove");
        btnRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUserActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddUser))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spnCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoveUser))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnExit)))
                .addGap(18, 18, 18)
                .addComponent(paneUserList, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoveUser)
                            .addComponent(spnCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addComponent(paneUserList, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addContainerGap())
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private static java.util.List<String> nameList = new ArrayList<String>();
    private static DefaultListModel jnameList = new DefaultListModel();
    private static int indx = 0;


    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        //Asks user for name, adds to list and to jlist
        String name = txtUserInput.getText();

        nameList.add(name);
        jnameList.addElement(indx + " " + nameList.get(indx));

        indx++;
        listUserL.setModel(jnameList);
        txtUserInput.setText("");
        try {
            FileWriter fullNameListFw = new FileWriter("C:\\Users\\admin\\Desktop\\FullNameList.txt", true);
            BufferedWriter fullNameListBw = new BufferedWriter(fullNameListFw);

            fullNameListBw.write(name);
            fullNameListBw.newLine();

            fullNameListBw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUserActionPerformed

        int spnValue = (Integer) spnCount.getValue();
        nameList.remove(spnValue);
        jnameList.clear();

        //Prints new jlist
        int a = 0;
        for (int j = 0; j < nameList.size(); j++) {
            jnameList.addElement(j + " " + nameList.get(j));
            a++;
        }
        indx = a;
        //Adds user names to file
        try {
            FileWriter fullNameListFw = new FileWriter("C:\\Users\\admin\\Desktop\\FullNameList.txt", true);
            BufferedWriter fullNameListBw = new BufferedWriter(fullNameListFw);
            PrintWriter writer = new PrintWriter("C:\\Users\\admin\\Desktop\\FullNameList.txt");
            writer.close();

            for (int i = 0; i < nameList.size(); i++) {
                fullNameListBw.write(nameList.get(i));
                fullNameListBw.newLine();
            }

            fullNameListBw.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnRemoveUserActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //Exit
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    public void startUp() {
        listUserL.setModel(jnameList);
    }

    public static void main(String args[]) throws IOException {
        //Adds list from file on startup
        FileReader fullNameListFr = new FileReader("C:\\Users\\admin\\Desktop\\FullNameList.txt");
        BufferedReader fullNameListBr = new BufferedReader(fullNameListFr);

        String st;

        int a = 0;
        while ((st = fullNameListBr.readLine()) != null) {
            nameList.add(st);
            jnameList.addElement(a + " " + nameList.get(a));
            a++;
        }
        indx = a;
        fullNameListBr.close();
        fullNameListFr.close();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_JAVA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemoveUser;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listUserL;
    private javax.swing.JScrollPane paneUserList;
    private javax.swing.JSpinner spnCount;
    private javax.swing.JTextPane txtUserInput;
    // End of variables declaration//GEN-END:variables
}
