
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/* Reference :
* https://youtu.be/vbW4Jk5xqlE
*/

/** 
 * @author Imeliana Jopi
 */
    
  // FRAME 3 = MAIN

public class PuzzleGame15 extends javax.swing.JFrame {
    
    public PuzzleGame15() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
            
    // FUNGSI 1 BlankSpacechecker(ActionGame), 
    // yang digunakan untuk memeriksa dan mengatur kotak kosong dalam permainan puzzle.
    
    // JButton merupakan object yang memiliki parameter Button1 dan Button2, yang merupakan tombol yang akan diperiksa.
    // Nilai teks dari Button2 disimpan dalam variabel RandomNumber menggunakan metode getText().
    // Kondisi if yang memeriksa apakah RandomNumber memiliki nilai kosong. 
    // Metode ini digunakan untuk memeriksa apakah kotak teks pada Button2 kosong. Jika kotak teks pada Button2 kosong, 
    // maka metode akan menukar teks dengan fungsi setText antara Button1 dan Button2, 
    // sehingga Button1 akan memiliki teks yang sebelumnya ada di Button2, dan Button2 akan kosong.        
            
    void BlankSpacechecker (JButton Button1, JButton Button2)
    {        
        String RandomNumber = Button2.getText();
        
        if (RandomNumber == "")
        {
           Button2.setText(Button1.getText());  
           Button1.setText("");
        }        
    }
// ======================================================================================================================================
    // FUNGSI 2 RESET (Mengacak), 
    // untuk mengacak urutan angka pada sebuah permainan puzzle dengan 16 kotak (15 kotak angka dan 1 kotak kosong).
    
    // Array integer bernama "buttnum" dengan ukuran 16 untuk menyimpan angka-angka yang akan diacak.
    // Variabel "i" dengan nilai 1 ini digunakan untuk mengontrol indeks saat mengisi array "buttnum".
    // Variabel "j" yang digunakan dalam loop untuk memeriksa apakah angka acak sudah ada dalam array.
    // Variabel "rowchecker" yang digunakan untuk menyimpan angka acak yang dihasilkan.
    // Deklarasi variabel boolean "flag" yang digunakan untuk memeriksa apakah angka acak sudah ada dalam array.
    // Setelah selesai mengacak angka-angka, nilai-nilai pada array "buttnum" digunakan untuk,
    // Mengatur teks pada masing-masing tombol dengan menggunakan metode setText().
    
    public void Reset() {        
        int[] buttnum = new int[16];
        int i = 1;
        int j;
        int rowchecker;
        boolean flag = false;

        do {
            Random rdm = new Random();
            rowchecker = rdm.nextInt(15) + 1;
        
            for (j = 1; j <= i; j++) {
                if (buttnum[j] == rowchecker) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                flag = false;
            } else {
                buttnum[i] = rowchecker;
                i++;
            }
        } while (i <= 15);

        buttnum1.setText(Integer.toString(buttnum[1]));
        buttnum2.setText(Integer.toString(buttnum[2]));
        buttnum3.setText(Integer.toString(buttnum[3]));
        buttnum4.setText(Integer.toString(buttnum[4]));
        buttnum5.setText(Integer.toString(buttnum[5]));
        buttnum6.setText(Integer.toString(buttnum[6]));
        buttnum7.setText(Integer.toString(buttnum[7]));
        buttnum8.setText(Integer.toString(buttnum[8]));
        buttnum9.setText(Integer.toString(buttnum[9]));
        buttnum10.setText(Integer.toString(buttnum[10]));
        buttnum11.setText(Integer.toString(buttnum[11]));
        buttnum12.setText(Integer.toString(buttnum[12]));
        buttnum13.setText(Integer.toString(buttnum[13]));
        buttnum14.setText(Integer.toString(buttnum[14]));
        buttnum15.setText(Integer.toString(buttnum[15]));
        buttblank.setText("");
}
    
// ======================================================================================================================================    
    //FUNGSI 3 clickschecker 3 (memeriksa benar dan clicks),
    // untuk memeriksa apakah pemain telah menyelesaikan permainan puzzle dengan mengklik tombol-tombol dengan urutan angka yang benar.
    // Jika telah selesai, pesan berhasil akan ditampilkan, dan jumlah klik juga akan ditampilkan.
    
    // Terdapat beberapa variabel yang menyimpan teks dari tombol-tombol pada permainan puzzle,,
    // (misalnya, buttnum1, buttnum2, dst.). Variabel-variabel ini digunakan untuk memeriksa nilai teks pada masing-masing tombol.
    // Pada bagian if statement, dilakukan pengecekan apakah nilai teks pada semua tombol sesuai dengan urutan angka 1 hingga 15. 
    // Jika benar, maka tampil pesan "Congratulations! You have successfully completed the game. Good job." menggunakan JOptionPane.
    // Setelah itu, nilai dari variabel "Counter" akan diincrement (ditambah 1), dan nilai tersebut ditampilkan pada komponen jnumofclicks. 
    
    int Counter;
    public void clicksChecker() {
        String B1 = buttnum1.getText();
        String B2 = buttnum2.getText();
        String B3 = buttnum3.getText();
        String B4 = buttnum4.getText();
        String B5 = buttnum5.getText();
        String B6 = buttnum6.getText();
        String B7 = buttnum7.getText();
        String B8 = buttnum8.getText();
        String B9 = buttnum9.getText();
        String B10 = buttnum10.getText();
        String B11 = buttnum11.getText();
        String B12 = buttnum12.getText();
        String B13 = buttnum13.getText();
        String B14 = buttnum14.getText();
        String B15 = buttnum15.getText();

        if (B1.equals("1") && B2.equals("2") && B3.equals("3") && B4.equals("4") && B5.equals("5") 
             && B6.equals("6") && B7.equals("7") && B8.equals("8") && B9.equals("9") && B10.equals("10") 
                && B11.equals("11") && B12.equals("12") && B13.equals("13") && B14.equals("14") && B15.equals("15")) 
        {
        JOptionPane.showMessageDialog(null, "Congratulations! You have successfully completed the game.\nGood job.",
        "Game Completed", JOptionPane.INFORMATION_MESSAGE);
        }

        Counter = Counter + 1;
        jnumofclicks.setText(Integer.toString(Counter));
    }
      
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        buttnum1 = new javax.swing.JButton();
        buttnum2 = new javax.swing.JButton();
        buttnum3 = new javax.swing.JButton();
        buttnum4 = new javax.swing.JButton();
        buttnum5 = new javax.swing.JButton();
        buttnum6 = new javax.swing.JButton();
        buttnum7 = new javax.swing.JButton();
        buttnum8 = new javax.swing.JButton();
        buttnum10 = new javax.swing.JButton();
        buttnum9 = new javax.swing.JButton();
        buttnum11 = new javax.swing.JButton();
        buttnum12 = new javax.swing.JButton();
        buttnum13 = new javax.swing.JButton();
        buttnum14 = new javax.swing.JButton();
        buttnum15 = new javax.swing.JButton();
        buttblank = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        buttonReset = new javax.swing.JButton();
        buttonHint = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jnumofclicks = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        jLabel2.setText("**MI PUZZLE**");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(90, 175, 100), 6));

        jLabel4.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        jLabel4.setText("**MI PUZZLE**");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel6.setText("Please enter your name : ");

        jTextField2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel7.setText("\"Welcome to MI Puzzle Game\"");

        jButton17.setText("START ->");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("EXIT");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel8.setText("Let's enjoy this game!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        buttnum1.setBackground(new java.awt.Color(204, 204, 204));
        buttnum1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum1.setText("1");
        buttnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum1ActionPerformed(evt);
            }
        });

        buttnum2.setBackground(new java.awt.Color(204, 204, 204));
        buttnum2.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum2.setText("2");
        buttnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum2ActionPerformed(evt);
            }
        });

        buttnum3.setBackground(new java.awt.Color(204, 204, 204));
        buttnum3.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum3.setText("3");
        buttnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum3ActionPerformed(evt);
            }
        });

        buttnum4.setBackground(new java.awt.Color(204, 204, 204));
        buttnum4.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum4.setText("4");
        buttnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum4ActionPerformed(evt);
            }
        });

        buttnum5.setBackground(new java.awt.Color(204, 204, 204));
        buttnum5.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum5.setText("5");
        buttnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum5ActionPerformed(evt);
            }
        });

        buttnum6.setBackground(new java.awt.Color(204, 204, 204));
        buttnum6.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum6.setText("6");
        buttnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum6ActionPerformed(evt);
            }
        });

        buttnum7.setBackground(new java.awt.Color(204, 204, 204));
        buttnum7.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum7.setText("7");
        buttnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum7ActionPerformed(evt);
            }
        });

        buttnum8.setBackground(new java.awt.Color(204, 204, 204));
        buttnum8.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum8.setText("8");
        buttnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum8ActionPerformed(evt);
            }
        });

        buttnum10.setBackground(new java.awt.Color(204, 204, 204));
        buttnum10.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum10.setText("10");
        buttnum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum10ActionPerformed(evt);
            }
        });

        buttnum9.setBackground(new java.awt.Color(204, 204, 204));
        buttnum9.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum9.setText("9");
        buttnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum9ActionPerformed(evt);
            }
        });

        buttnum11.setBackground(new java.awt.Color(204, 204, 204));
        buttnum11.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum11.setText("11");
        buttnum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum11ActionPerformed(evt);
            }
        });

        buttnum12.setBackground(new java.awt.Color(204, 204, 204));
        buttnum12.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum12.setText("12");
        buttnum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum12ActionPerformed(evt);
            }
        });

        buttnum13.setBackground(new java.awt.Color(204, 204, 204));
        buttnum13.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum13.setText("13");
        buttnum13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum13ActionPerformed(evt);
            }
        });

        buttnum14.setBackground(new java.awt.Color(204, 204, 204));
        buttnum14.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum14.setText("14");
        buttnum14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum14ActionPerformed(evt);
            }
        });

        buttnum15.setBackground(new java.awt.Color(204, 204, 204));
        buttnum15.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttnum15.setText("15");
        buttnum15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnum15ActionPerformed(evt);
            }
        });

        buttblank.setBackground(new java.awt.Color(204, 204, 204));
        buttblank.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttblank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttblankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(buttnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(buttnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(buttnum10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttnum11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttnum12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(buttnum13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttnum14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttnum15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttblank, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttnum10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttnum12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttnum13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttnum15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttnum14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttblank, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 410, 390));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        jLabel5.setText("**MI PUZZLE**");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 90));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        buttonReset.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonHint.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttonHint.setText("Hint");
        buttonHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHintActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(255, 50, 50));
        buttonExit.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonHint, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(buttonHint, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 320, 270));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        jLabel11.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Clicks");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        jnumofclicks.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jnumofclicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnumofclicks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 175, 120), 4));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jnumofclicks, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jnumofclicks, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 320, 110));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 30)); // NOI18N
        jLabel1.setText("GOOD LUCK !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//========================================================================================================================================    
    
    // FUNGSI ACTION PADA KOTAK-KOTAK ANGKA DAN KOTAK KOSONG . . .
    // BlankSpacechecker( Button1, Button2); merupakan pemanggil fungsi 1 "BlankSpacechecker" dengan argumen-argumen di dalamnya 
    // yang digunakan untuk menjalankan fungsi tersebut pada kotak-kotak ini. 
    // clicksChecker() merupakan pemanggil fungsi  3 "clicksChecker" yang digunakna untuk menjalankan fungsi tersebut pada kotak-kotak ini.
    
    private void buttnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum1ActionPerformed
        BlankSpacechecker(buttnum1, buttnum2);
        BlankSpacechecker(buttnum1, buttnum5); 
        clicksChecker();
    }//GEN-LAST:event_buttnum1ActionPerformed

    private void buttnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum2ActionPerformed
        BlankSpacechecker(buttnum2, buttnum1);
        BlankSpacechecker(buttnum2, buttnum3);
        BlankSpacechecker(buttnum2, buttnum6);
        clicksChecker();
    }//GEN-LAST:event_buttnum2ActionPerformed

    private void buttnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum3ActionPerformed
        BlankSpacechecker(buttnum3, buttnum2);
        BlankSpacechecker(buttnum3, buttnum4);
        BlankSpacechecker(buttnum3, buttnum7);
        clicksChecker();
    }//GEN-LAST:event_buttnum3ActionPerformed

    private void buttnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum4ActionPerformed
        BlankSpacechecker(buttnum4, buttnum3);
        BlankSpacechecker(buttnum4, buttnum8);
        clicksChecker();
    }//GEN-LAST:event_buttnum4ActionPerformed

    private void buttnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum5ActionPerformed
        BlankSpacechecker(buttnum5, buttnum1);
        BlankSpacechecker(buttnum5, buttnum6);
        BlankSpacechecker(buttnum5, buttnum9);
        clicksChecker();
    }//GEN-LAST:event_buttnum5ActionPerformed

    private void buttnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum6ActionPerformed
        BlankSpacechecker(buttnum6, buttnum2);
        BlankSpacechecker(buttnum6, buttnum5);
        BlankSpacechecker(buttnum6, buttnum7);
        BlankSpacechecker(buttnum6, buttnum10);
        clicksChecker();
    }//GEN-LAST:event_buttnum6ActionPerformed

    private void buttnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum7ActionPerformed
        BlankSpacechecker(buttnum7, buttnum3);
        BlankSpacechecker(buttnum7, buttnum6);
        BlankSpacechecker(buttnum7, buttnum8);
        BlankSpacechecker(buttnum7, buttnum11);
        clicksChecker();
    }//GEN-LAST:event_buttnum7ActionPerformed

    private void buttnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum8ActionPerformed
        BlankSpacechecker(buttnum8, buttnum4);
        BlankSpacechecker(buttnum8, buttnum7);
        BlankSpacechecker(buttnum8, buttnum12);
        clicksChecker();
    }//GEN-LAST:event_buttnum8ActionPerformed

    private void buttnum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum10ActionPerformed
        BlankSpacechecker(buttnum10, buttnum6);
        BlankSpacechecker(buttnum10, buttnum9);
        BlankSpacechecker(buttnum10, buttnum11);
        BlankSpacechecker(buttnum10, buttnum14);
        clicksChecker();
    }//GEN-LAST:event_buttnum10ActionPerformed

    private void buttnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum9ActionPerformed
        BlankSpacechecker(buttnum9, buttnum5);
        BlankSpacechecker(buttnum9, buttnum10);
        BlankSpacechecker(buttnum9, buttnum13);
        clicksChecker();
    }//GEN-LAST:event_buttnum9ActionPerformed

    private void buttnum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum11ActionPerformed
        BlankSpacechecker(buttnum11, buttnum7);
        BlankSpacechecker(buttnum11, buttnum10);
        BlankSpacechecker(buttnum11, buttnum12);
        BlankSpacechecker(buttnum11, buttnum15);
        clicksChecker();
    }//GEN-LAST:event_buttnum11ActionPerformed

    private void buttnum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum12ActionPerformed
        BlankSpacechecker(buttnum12, buttnum8);
        BlankSpacechecker(buttnum12, buttnum11);
        BlankSpacechecker(buttnum12, buttblank);
        clicksChecker();
    }//GEN-LAST:event_buttnum12ActionPerformed

    private void buttnum13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum13ActionPerformed
        BlankSpacechecker(buttnum13, buttnum9);
        BlankSpacechecker(buttnum13, buttnum14);
        clicksChecker();
    }//GEN-LAST:event_buttnum13ActionPerformed

    private void buttnum14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum14ActionPerformed
        BlankSpacechecker(buttnum14, buttnum13);
        BlankSpacechecker(buttnum14, buttnum10);
        BlankSpacechecker(buttnum14, buttnum15);
        clicksChecker();
    }//GEN-LAST:event_buttnum14ActionPerformed

    private void buttnum15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnum15ActionPerformed
        BlankSpacechecker(buttnum15, buttnum11);
        BlankSpacechecker(buttnum15, buttnum14);
        BlankSpacechecker(buttnum15, buttblank);
        clicksChecker();
    }//GEN-LAST:event_buttnum15ActionPerformed

    private void buttblankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttblankActionPerformed
        BlankSpacechecker(buttblank, buttnum12);
        BlankSpacechecker(buttblank, buttnum15);
        clicksChecker();
    }//GEN-LAST:event_buttblankActionPerformed

//=======================================================================================================================================    
    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       //--
    }//GEN-LAST:event_jTextField2ActionPerformed

//=======================================================================================================================================    
    
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // Mengatur tampilan aplikasi untuk menampilkan tampilan selanjutnya pada aplikasi(Execute)
        // Menampikan output dari input yang dilakukan pengguna (Execute)    
        this.setVisible(false);
        new PuzzleGame15().setVisible(true);
        String input = nameInput.getText();
        outputName.setText(input);
    }//GEN-LAST:event_jButton17ActionPerformed

//=======================================================================================================================================    
    
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //Menutup aplikasi (Home)
        System.exit(0);
    }//GEN-LAST:event_jButton18ActionPerformed

//=======================================================================================================================================    
    
    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // Reset(); merupakan pemanggil Fungsi 2 (Reset), yang digunakan untuk menjalankan fungsi tersebut pada button ini.
        Reset();
    }//GEN-LAST:event_buttonResetActionPerformed
//========================================================================================================================================
    
    private void buttonHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHintActionPerformed
        // Mengatur teks pada setiap tombol angka (buttnum1 hingga buttnum15) dengan angka yang benar yaitu dari 1 hingga 15. 
        // Kemudian, tombol kosong (buttblank) diatur dengan teks kosong atau tidak ada teks sama sekali.
        buttnum1.setText("1");
        buttnum2.setText("2");
        buttnum3.setText("3");
        buttnum4.setText("4");
        buttnum5.setText("5");
        buttnum6.setText("6");
        buttnum7.setText("7");
        buttnum8.setText("8");
        buttnum9.setText("9");
        buttnum10.setText("10");
        buttnum11.setText("11");
        buttnum12.setText("12");
        buttnum13.setText("13");
        buttnum14.setText("14");
        buttnum15.setText("15");
        buttblank.setText("");        
    }//GEN-LAST:event_buttonHintActionPerformed

// ======================================================================================================================================================    
    private JFrame frame;
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // Membuat sebuah objek JFrame baru dengan judul "Exit" dan menyimpannya ke dalam variabel frame.
        // Membuka dialog konfirmasi menggunakan JOptionPane yang menampilkan pesan "Do you want to exit the game ?" dengan judul "MI PUZZLE" ,
        // dan pilihan tombol "Yes" dan "No". Jika pemain memilih "Yes" (pilihan YES_NO_OPTION), maka kondisi akan langsung Exit.
        frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Do you want to exit the game ?", "MI PUZZLE", 
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }    
    }//GEN-LAST:event_buttonExitActionPerformed

//========================================================================================================================================================    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Reset(); merupakan pemanggil fungsi 2 (Reset) yang dipanggil secara otomatis ketika jendela frame ini diaktifkan.
        Reset();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(PuzzleGame15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGame15().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttblank;
    private javax.swing.JButton buttnum1;
    private javax.swing.JButton buttnum10;
    private javax.swing.JButton buttnum11;
    private javax.swing.JButton buttnum12;
    private javax.swing.JButton buttnum13;
    private javax.swing.JButton buttnum14;
    private javax.swing.JButton buttnum15;
    private javax.swing.JButton buttnum2;
    private javax.swing.JButton buttnum3;
    private javax.swing.JButton buttnum4;
    private javax.swing.JButton buttnum5;
    private javax.swing.JButton buttnum6;
    private javax.swing.JButton buttnum7;
    private javax.swing.JButton buttnum8;
    private javax.swing.JButton buttnum9;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHint;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jnumofclicks;
    // End of variables declaration//GEN-END:variables
}
