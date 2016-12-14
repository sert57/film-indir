import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Download_Manager extends javax.swing.JFrame 
{
    DefaultTableModel dtm;
    DefaultTableModel dtm2;
    public static String at="";
    public static String at2="";
    public static String val = "";
    public static String val2 = "";
    public Download_Manager() {
        initComponents();
        try
        {
            dtm=(DefaultTableModel)jTable2.getModel();
            dtm2=(DefaultTableModel)jTable4.getModel();
            
            File f=new File("C:\\film_download\\filmlerM.txt");
            Scanner oku=new Scanner(f,"UTF-8");
            while(oku.hasNextLine())
            {
                String satir[]=oku.nextLine().split(";");
                Object[]row={satir[0],satir[1],satir[2],satir[3],satir[4],satir[5]};
                dtm.addRow(row);         
            }
            File g=new File("C:\\film_download\\SeriesM.txt");
            oku=new Scanner(g,"UTF-8");
            while(oku.hasNextLine())
            {
                String satir[]=oku.nextLine().split(";");
                Object[]row={satir[0],satir[1],satir[2],satir[3],satir[4],satir[5]};
                dtm2.addRow(row);         
            }
            ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\film_download\\icon.jpg").getImage().getScaledInstance(160, 160, 160));
            jLabel1.setIcon(imageIcon);
            }catch(Exception e){e.printStackTrace();}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA DOWNLOAD MANAGER");
        setBackground(new java.awt.Color(204, 0, 255));
        setForeground(new java.awt.Color(255, 153, 51));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(204, 255, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İSİM", "YIL", "IMDB PUAN", "TÜR", "URL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(102, 255, 204));
        jTable2.setSelectionForeground(new java.awt.Color(255, 153, 0));
        jTable2.setSurrendersFocusOnKeystroke(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("FİLM ARA");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("FİLM BİLGİLERİ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("İsmi:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Boyutu:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Ülke:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Süre:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Yönetmen:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("EAGLE İLE İNDİR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setBackground(new java.awt.Color(204, 255, 102));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İSİM", "YIL", "IMDB PUAN", "TÜR", "URL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setSelectionForeground(new java.awt.Color(255, 153, 0));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("DİZİ ARA");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 255, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("TAVSİYE EDİLEN PROGRAMLAR");

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("İNTERNET DOWNLOAD MANAGER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("EAGLE GET");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 255, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("BS PLAYER");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("DİZİ BİLGİLERİ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("İsmi:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Boyutu:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Ülke:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Süre:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Yönetmen:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel15)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton8.setBackground(new java.awt.Color(0, 204, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("IDM İLE  İNDİR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 204, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("EAGLE İLE İNDİR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 204, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("IDM İLE  İNDİR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(3, 3, 3)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7)
                                            .addComponent(jButton6)))
                                    .addComponent(jButton3)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jLabel10)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)
                            .addComponent(jButton10)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void refreshtable() throws Exception
    {
        if(!val.isEmpty())
        {
            dtm.setRowCount(0);
            File f=new File("C:\\film_download\\filmlerM.txt");
            Scanner oku=new Scanner(f,"UTF-8");
            while(oku.hasNextLine())
            {
                String satir[]=oku.nextLine().split(";");
                String ad=satir[1].toLowerCase();
                if(ad.contains(val))
                {
                    Object[]row={satir[0],satir[1],satir[2],satir[3],satir[4],satir[5]};
                    dtm.addRow(row);
                }
            }
           
        }
        else
        {
            File f=new File("C:\\film_download\\filmlerM.txt");
            Scanner oku=new Scanner(f,"UTF-8");
            while(oku.hasNextLine())
            {
                String satir[]=oku.nextLine().split(";");
                Object[]row={satir[0],satir[1],satir[2],satir[3],satir[4],satir[5]};
                dtm.addRow(row);
           }
        }
    }
    public void refreshtable2() throws Exception
    {
        if(!val2.isEmpty())
        {
            dtm2.setRowCount(0);
            File f=new File("C:\\film_download\\SeriesM.txt");
            Scanner oku=new Scanner(f,"UTF-8");
            while(oku.hasNextLine())
            {
                String satir[]=oku.nextLine().split(";");
                String ad=satir[1].toLowerCase();
                if(ad.contains(val2))
                {
                    Object[]row={satir[0],satir[1],satir[2],satir[3],satir[4],satir[5]};
                    dtm2.addRow(row);
                }
            }
           
        }
        else
        {
            File f=new File("C:\\film_download\\SeriesM.txt");
            Scanner oku=new Scanner(f,"UTF-8");
            while(oku.hasNextLine())
            {
                String satir[]=oku.nextLine().split(";");
                Object[]row={satir[0],satir[1],satir[2],satir[3],satir[4],satir[5]};
                dtm2.addRow(row);
           }
        }
    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        try{
        String metin=jTextField1.getText()+ evt.getKeyChar();
        Download_Manager.val = metin.trim().toLowerCase();
        refreshtable();
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jTextField1KeyTyped
   
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       new Thread()
       {
           public void run()
           {
               try{
            int ndx=jTable2.getSelectedRow();
            if(ndx==-1) return;
            String link=jTable2.getValueAt(ndx,5).toString();
            URL u=new URL(link);
            URLConnection uc=u.openConnection();
            double Boyut=uc.getContentLength();
            String DosyaBoyutum=(String.format("%.2f ",Boyut/1024/1024)+"MB");
            jLabel18.setText("Boyutu      : "+DosyaBoyutum);
            Download_Manager.at=jTable2.getValueAt(ndx, 1).toString();
            if(at.contains(">"))
            {
                at=at.replace(">","").trim();
            }
            if(at.contains("."))
            {
                at=at.replace("."," ").trim();
            } 
            if(at.contains("-"))
            {
                at=at.replace("-"," ");
            } 
            if(at.contains("_"))
            {
                at=at.replace("_"," ");
            }        
            
             Object ad2[]=at.split(" ");
            
             
             if
               ((!ad2[1].toString().endsWith(")")) && (!ad2[1].toString().startsWith("20"))&& (!ad2[1].toString().startsWith("19"))&&  
               (!ad2[1].toString().endsWith("p"))&& (!ad2[2].toString().endsWith(")")) && (!ad2[2].toString().startsWith("20"))&& 
               (!ad2[2].toString().startsWith("19"))&&  (!ad2[2].toString().endsWith("p"))&& (!ad2[3].toString().endsWith(")")) &&
               (!ad2[3].toString().startsWith("20"))&& (!ad2[3].toString().startsWith("19"))&&  
               (!ad2[3].toString().endsWith("p"))&& (!ad2[3].toString().endsWith("v")))
       {
           Download_Manager.at=ad2[0]+" "+ad2[1]+" "+ad2[2]+" "+ad2[3];
       }
       else if((!ad2[1].toString().endsWith(")")) && (!ad2[1].toString().startsWith("20"))&& (!ad2[1].toString().startsWith("19"))&&  
               (!ad2[1].toString().endsWith("p"))&& (!ad2[2].toString().endsWith(")")) && (!ad2[2].toString().startsWith("20"))&& 
               (!ad2[2].toString().startsWith("19"))&&  (!ad2[2].toString().endsWith("p")))
       {
           Download_Manager.at=ad2[0]+" "+ad2[1]+" "+ad2[2];
       }
       else if((!ad2[1].toString().endsWith(")")) && (!ad2[1].toString().startsWith("20"))&& (!ad2[1].toString().startsWith("19"))&&  
               (!ad2[1].toString().endsWith("p")))
       {
           Download_Manager.at=ad2[0]+" "+ad2[1];
       }
             else
       {
           Download_Manager.at=ad2[0].toString();
       }
           
            Document doc = Jsoup.connect("http://www.omdbapi.com/")
                    .timeout(30000)         // Bağlantı Zaman Aşımı
                    .userAgent("Mozilla") // Internet Tarayıcısı Kimliği
                    .followRedirects(true)
                    .ignoreContentType(true)
                    .data("t", at)
                    .data("y","")
                    .data("plot","full")
                    .data("r","xml")
                    .get();
            // Dokumandaki <movie>...</movie> nodelarının ilkini al
                Element film = doc.select("movie").first();
                String isim=film.attr("title");
                jLabel8.setText("İsmi           : "+isim);
                String ulke=film.attr("country");
                jLabel20.setText("Ülke           : "+ulke);
                String sure=film.attr("Runtime");
                jLabel21.setText("Süre          : "+sure);
                String director=film.attr("director");
                jLabel22.setText("Yönetmen : "+director);
                String poster=film.attr("poster");
                URL ur=new URL(poster);
                BufferedImage image = ImageIO.read(ur);
                jLabel7.setIcon(new ImageIcon(image));
        }catch(Exception e){e.printStackTrace();}
           }
       }.start();
       
    }//GEN-LAST:event_jTable2MouseClicked
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     try{
        Runtime.getRuntime().exec("\"c:\\Program Files (x86)\\Internet Download Manager\\IDMan.exe\"");
        int ndx=jTable2.getSelectedRow();
        if(ndx==-1) return;
        String url=jTable2.getValueAt(ndx,5).toString();
        StringSelection stringSelection = new StringSelection(url);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
        }catch(Exception e){e.printStackTrace();}   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        new Thread()
       {
           public void run()
           {
               try{
            int ndx=jTable4.getSelectedRow();
            if(ndx==-1) return;
            String link=jTable4.getValueAt(ndx,5).toString();
            URL u=new URL(link);
            URLConnection uc=u.openConnection();
            double Boyut=uc.getContentLength();
            String DosyaBoyutum=(String.format("%.2f ",Boyut/1024/1024)+"MB");
            jLabel27.setText("Boyutu      : "+DosyaBoyutum);
            Download_Manager.at2=jTable4.getValueAt(ndx, 1).toString();
            if(at2.contains(">"))
            {
                at2=at2.replace(">","").trim();
            }
            if(at2.contains("."))
            {
                at2=at2.replace("."," ").trim();
            } 
            if(at2.contains("-"))
            {
                at2=at2.replace("-"," ");
            } 
            if(at2.contains("_"))
            {
                at2=at2.replace("_"," ");
            }        
            
             Object ad2[]=at2.split(" ");
            if
               ((!ad2[1].toString().endsWith(")")) && (!ad2[1].toString().startsWith("S"))&& (!ad2[1].toString().startsWith("E"))&&  
               (!ad2[1].toString().endsWith("p"))&& (!ad2[2].toString().endsWith(")")) && (!ad2[2].toString().startsWith("S"))&&
               (!ad2[2].toString().startsWith("E"))&&  (!ad2[2].toString().endsWith("p"))&& (!ad2[3].toString().endsWith(")")) &&
               (!ad2[3].toString().startsWith("S"))&&(!ad2[3].toString().startsWith("E"))&&  (!ad2[3].toString().endsWith("p")) )
       {
           Download_Manager.at2=ad2[0]+" "+ad2[1]+" "+ad2[2]+" "+ad2[3];
       }
            else if
               ((!ad2[1].toString().endsWith(")")) && (!ad2[1].toString().startsWith("S"))&& (!ad2[1].toString().startsWith("E"))&&  
               (!ad2[1].toString().endsWith("p"))&& (!ad2[2].toString().endsWith(")")) && (!ad2[2].toString().startsWith("S"))&&
               (!ad2[2].toString().startsWith("E"))&&  (!ad2[2].toString().endsWith("p")) )
       {
           Download_Manager.at2=ad2[0]+" "+ad2[1]+" "+ad2[2];
       }
            else if
               ((!ad2[1].toString().endsWith(")")) && (!ad2[1].toString().startsWith("S"))&& (!ad2[1].toString().startsWith("E"))&&  
               (!ad2[1].toString().endsWith("p")))
       {
           Download_Manager.at2=ad2[0]+" "+ad2[1];
       }
            else
            {
                Download_Manager.at2=ad2[0].toString();
            }
             
            Document doc = Jsoup.connect("http://www.omdbapi.com/")
                    .timeout(30000)         // Bağlantı Zaman Aşımı
                    .userAgent("Mozilla") // Internet Tarayıcısı Kimliği
                    .followRedirects(true)
                    .ignoreContentType(true)
                    .data("t", at2)
                    .data("y","")
                    .data("plot","full")
                    .data("r","xml")
                    .get();
            // Dokumandaki <movie>...</movie> nodelarının ilkini al
                Element film = doc.select("movie").first();
                String isim=film.attr("title");
                jLabel16.setText("İsmi           : "+isim);
                String ulke=film.attr("country");
                jLabel28.setText("Ülke           : "+ulke);
                String sure=film.attr("Runtime");
                jLabel29.setText("Süre          : "+sure);
                String director=film.attr("director");
                jLabel30.setText("Yönetmen : "+director);
                String poster=film.attr("poster");
                URL ur=new URL(poster);
                BufferedImage image = ImageIO.read(ur);
                jLabel17.setIcon(new ImageIcon(image));
        }catch(Exception e){e.printStackTrace();}
           }
       }.start();
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        try{
        String metin=jTextField2.getText()+ evt.getKeyChar();
        Download_Manager.val2 = metin.trim().toLowerCase();
        refreshtable2();
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.internetdownloadmanager.com");
        }catch(Exception e){
            try{
            Runtime.getRuntime().exec("cmd.exe /c start iexplore www.internetdownloadmanager.com");
            }catch(Exception ee){ee.printStackTrace();
            }}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
        Runtime.getRuntime().exec("cmd.exe /c start chrome www.eagleget.com/download/");
        }catch(Exception e){
            try{
            Runtime.getRuntime().exec("cmd.exe /c start iexplore www.eagleget.com/download/");
            }catch(Exception ee){ee.printStackTrace();
            }}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
        Runtime.getRuntime().exec("cmd.exe /c start chrome http://bsplayer.com/bsplayer-english/download.html");
        }catch(Exception e){
            try{
            Runtime.getRuntime().exec("cmd.exe /c start iexplore http://bsplayer.com/bsplayer-english/download.html");
            }catch(Exception ee){ee.printStackTrace();
            }}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
             try{
        Runtime.getRuntime().exec("\"c:\\Program Files (x86)\\Internet Download Manager\\IDMan.exe\"");
        int ndx=jTable2.getSelectedRow();
        if(ndx==-1) return;
        String url=jTable2.getValueAt(ndx,5).toString();
        StringSelection stringSelection = new StringSelection(url);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     try{
        Runtime.getRuntime().exec("\"c:\\Program Files (x86)\\Internet Download Manager\\IDMan.exe\"");
        int ndx=jTable4.getSelectedRow();
        if(ndx==-1) return;
        String url=jTable4.getValueAt(ndx,5).toString();
        StringSelection stringSelection = new StringSelection(url);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
        }catch(Exception e){e.printStackTrace();}            
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         try{
        Runtime.getRuntime().exec("\"c:\\Program Files (x86)\\Internet Download Manager\\IDMan.exe\"");
        int ndx=jTable4.getSelectedRow();
        if(ndx==-1) return;
        String url=jTable4.getValueAt(ndx,5).toString();
        StringSelection stringSelection = new StringSelection(url);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Download_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Download_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Download_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Download_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Download_Manager().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
