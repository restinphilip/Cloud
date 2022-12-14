/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author resti
 */
public class HomePage extends javax.swing.JFrame {

    public static File[] folder = null;
    public static ArrayList<ArrayList<String>> iList = new ArrayList<>();
    public static ArrayList<String> accessKeyList = new ArrayList<>();
    public static HashMap<String, String> encKeyList = new HashMap<>();
    public static ArrayList<ArrayList<Tree_CH>> tList = new ArrayList<>();
    ArrayList<String> swList = new ArrayList<>();
    ArrayList<ArrayList<String>> wList = new ArrayList<>();
    ArrayList<ArrayList<Double>> cList = new ArrayList<>();
    public static BloomFilter user_bf = new BloomFilter(30, 8);
    public static String req = null;

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Data Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create AP (D1)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Encrypt Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Create Index(D2)");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Data Owner");

        jButton7.setText("Key");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton5)
                        .addGap(69, 69, 69)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            folder = new File("data").listFiles();
            for (File f : folder) {
                jTextArea1.append(f.getName() + "\n");
                jComboBox1.addItem(f.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++        // TODO add your handling code here:
        try {

            String aln = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random r = new Random();
            jTextArea1.setText("");
            for (File f : folder) {
                int num = 0;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 16; i++) {
                    num = r.nextInt(aln.length());
                    sb.append(aln.charAt(num));
                }
                String accessKey = sb.toString();
                jTextArea1.append("\n"+f.getName()+"\tAccess Key " + accessKey);
                accessKeyList.add(accessKey);
                encKeyList.put(f.getName(), accessKey);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            jTextArea1.setText("Encrypting...\n\n");
            FileUtils.cleanDirectory(new File("enc"));
            int i=0;
            for (File f : folder) {
                String key = encKeyList.get(f.getName());
                File inputFile = f;
                File encryptedFile = new File("./enc/" + f.getName().replace("txt", "aes"));
                AES.encDec(Cipher.ENCRYPT_MODE, key, inputFile, encryptedFile);
                i++;
            }
            jTextArea1.append("Files Are Encrypted, stored into folder ./enc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            jTextArea1.setText("");
            int fIndex = jComboBox1.getSelectedIndex();
            BufferedReader br = new BufferedReader(new FileReader(folder[fIndex]));
            String s = null;
            while ((s = br.readLine()) != null) {
                jTextArea1.append(s + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {

            //jTextArea1.setText("Creating Index...\n\n");
            //Stopwords
            BufferedReader swReader = new BufferedReader(new FileReader("./sw/sw.txt"));
            String tempSW = null;
            while ((tempSW = swReader.readLine()) != null) {
                tempSW = tempSW.replaceAll(" ", "");
                tempSW = tempSW.replaceAll("[^a-zA-Z]", "");
                swList.add(tempSW);
                tempSW = tempSW.substring(0, 1).toUpperCase() + tempSW.substring(1);
                swList.add(tempSW);
            }
            System.out.println("Check" + swList);
            //jTextArea1.append("Preprocessing...\n\n");
            for (int i = 0; i < folder.length; i++) {
                BufferedReader br = new BufferedReader(new FileReader(folder[i]));
                String s = null;
                ArrayList<String> twL = new ArrayList<>();
                ArrayList<String> tiL = new ArrayList<>();
                ArrayList<Double> tcL = new ArrayList<>();
                wList.add(twL);
                iList.add(tiL);
                cList.add(tcL);
                while ((s = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(s);
                    String temp = null;
                    while (st.hasMoreTokens()) {
                        temp = st.nextToken();
                        temp = temp.replaceAll("[^a-zA-Z]", "");
                        temp = temp.replaceAll(" ", "");
                        if (!swList.contains(temp) && !temp.isEmpty()) {
                            if (wList.get(i).contains(temp)) {
                                int ind = wList.get(i).indexOf(temp);
                                double val = cList.get(i).get(ind);
                                val += 1.0;
                                cList.get(i).set(ind, val);
                            } else {
                                wList.get(i).add(temp);
                                cList.get(i).add(1.0);
                            }
                        }
                    }
                }
            }
            jTextArea1.append("Creating Index...\n\n");
            //Sorting
            for (int i = 0; i < wList.size(); i++) {
                System.out.println("i : " + i);
                System.out.println(wList.get(i));
                System.out.println(cList.get(i));
                for (int j = 0; j < wList.get(i).size(); j++) {
                    for (int k = j; k < wList.get(i).size(); k++) {
                        if (cList.get(i).get(j) < cList.get(i).get(k)) {
                            double t1 = cList.get(i).get(j);
                            String t2 = wList.get(i).get(j);
                            cList.get(i).set(j, cList.get(i).get(k));
                            wList.get(i).set(j, wList.get(i).get(k));
                            cList.get(i).set(k, t1);
                            wList.get(i).set(k, t2);
                        }
                    }
                }
                System.out.println("Sorted i(" + i + ") ::");
                System.out.println(wList.get(i));
                System.out.println(cList.get(i));
                for (int x = 0; x < 10; x++) {
                    iList.get(i).add(wList.get(i).get(x));
                }
            }

            jTextArea1.append("Index Created :: \n");
            for (int i = 0; i < wList.size(); i++) {
                ArrayList<Tree_CH> tempTlist = new ArrayList<>();
                jTextArea1.append(folder[i].getName() + "\n");
                jTextArea1.append(iList.get(i) + "\n");
                tList.add(tempTlist);
            }

            jTextArea1.setText("D2 :: \n");
            File f = new File("WordNet-2.1/dict");
            System.setProperty("wordnet.database.dir", f.toString());
            WordNetDatabase database = WordNetDatabase.getFileInstance();
            String wordForm = null;
            for (int x = 0; x < folder.length; x++) {
                jTextArea1.append(folder[x].getName() + "\n");
                for (int y = 0; y < iList.get(x).size(); y++) {
                    wordForm = iList.get(x).get(y);
                    Tree_CH ti = new Tree_CH(wordForm);
                    jTextArea1.append("Index(Di)\t: " + wordForm + "\n");
                    Synset[] synsets = database.getSynsets(wordForm);
                    if (synsets.length > 0) {
                        ArrayList<String> al = new ArrayList<String>();
                        HashSet hs = new HashSet();
                        for (int i = 0; i < synsets.length; i++) {
                            String[] wordForms = synsets[i].getWordForms();
                            for (int j = 0; j < wordForms.length; j++) {
                                al.add(wordForms[j]);
                            }
                        }
                        hs.addAll(al);
                        al.clear();
                        al.addAll(hs);
                        for (int i = 0; i < al.size(); i++) {
                            System.out.println(al.get(i));
                            jTextArea1.append("Concept Hierarchy(Dj)\t\t: " + al.get(i) + "\n");
                            ti.insert(al.get(i));
                        }
                        tList.get(x).add(ti);
                        //jTextArea1.append("\nTree Created for " + wordForm + "\n\n");
                    } else {
                        System.out.println("No Concept Hierarchy for '" + wordForm + "'");
                        tList.get(x).add(ti);
                    }
                }
            }
            //System.out.println("Check :: "+tList.get(0).get(0).isRoot(iList.get(0).get(0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            CloudTransfer ct = new CloudTransfer();
            ct.setVisible(true);
            ct.setResizable(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            if(user_bf.contains(req.split("#")[1])){
                DataUser.key = encKeyList.get(req.split("#")[0]);
                JOptionPane.showMessageDialog(this, "Key Sent");
            }else{
                JOptionPane.showMessageDialog(this, "Authentication Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
