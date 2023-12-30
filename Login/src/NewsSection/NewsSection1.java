/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NewsSection;

import MainMenu.MainPage;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.event.HyperlinkEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

/**
 *
 * @author LIEW
 */
public class NewsSection1 extends javax.swing.JFrame {

    /**
     * Creates new form NewsSection1
     */
    public NewsSection1() {
        initComponents();
        displayNews();
    }
    
     public void displayNews() {
        
        // try catch block use to handle exception
        try {
            // create a file object
            File newsFile = new File("C:\\Users\\60187\\Documents\\NetBeansProjects\\Assignment\\Login\\src\\NewsSection\\NewsSample.txt");
            // create a scanner object
            Scanner sc = new Scanner(newsFile);
            // define variable for counting the number of news
            int cnt = 0;

            // create an 2D arrayList for storing the news (title + url + date)
            ArrayList<ArrayList<String>> newsList = new ArrayList<ArrayList<String>>();

            while(sc.hasNextLine()) {

                // create a temporary ArrayList for storing news
                ArrayList<String> news = new ArrayList<>();

                // scan through each line of NewsSample.txt
                for(int i = 0; i< 4; i++) {
                    if (sc.hasNextLine()) {
                        news.add(sc.nextLine());  
                    }
                }

                String title = news.get(0);

                // add the news that contain "nature" to the 2D array
                if(title.toLowerCase().contains("nature")) {
                    newsList.add(news);
                }
               
            }

            // sort the news from latest to oldest
            sortNews(newsList);
            
            //display the sorted news in the text area
            displayInTextArea(newsList);
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }
     
    private void displayInTextArea(ArrayList<ArrayList<String>> newsList) {
        StringBuilder newsText = new StringBuilder();
        int count = 1;

        for (ArrayList<String> news : newsList) {
            newsText.append("<div>");
            newsText.append("<b>").append(news.get(0)).append("</b><br>"); // Title
            newsText.append("<a href=\"").append(news.get(1)).append("\">Read more</a><br>"); // Link
            newsText.append(news.get(2)).append("<br>"); // Date or additional info
            newsText.append("</div><br>");
    }

        jEditorPane1.setContentType("text/html");
        jEditorPane1.setText("<html><body>" + newsText.toString() + "</body></html>");

        jEditorPane1.addHyperlinkListener(e -> {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(e.getURL().toURI());
                    } catch (IOException | java.net.URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    // define a sorting method
    public static void sortNews(ArrayList<ArrayList<String>> arr) {

        // create an ArrayList for storing dates
        ArrayList<Date> datesList = new ArrayList<Date>();
        Date date;
        SimpleDateFormat formatDate = new SimpleDateFormat("dd MMM yyyy");

        try {

            // parse the string into date and store it into ArrayList
            for(int i = 0; i < arr.size(); i++) {
            date = formatDate.parse(arr.get(i).get(2));
            datesList.add(date);
            }

            // Using buble sort to sort the news from latest to oldest
            for(int i = 0; i < arr.size() - 1; i++) {
                for(int j = 0; j < arr.size() - i - 1; j++) {
                    if(datesList.get(j+1).after(datesList.get(j))) {
                        ArrayList<Date> datesListTemp = new ArrayList<Date>();
                        datesListTemp.add(datesList.get(j));
                        datesList.set(j, datesList.get(j+1));
                        datesList.set(j+1, datesListTemp.get(0));
                        ArrayList<ArrayList<String>> arrTemp = new ArrayList<ArrayList<String>>();
                        arrTemp.add(arr.get(j));
                        arr.set(j, arr.get(j+1));
                        arr.set(j+1,arrTemp.get(0));
                    }
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }}
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 110, 27));

        jEditorPane1.setEditable(false);
        jEditorPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Serif Pro Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Top 5 News About Nature");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        MainPage MainPage = new MainPage();
        MainPage.setVisible(true);
        MainPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewsSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewsSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewsSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewsSection1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewsSection1 NewsSection1 = new NewsSection1();
                NewsSection1.setVisible(true);
                NewsSection1.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
