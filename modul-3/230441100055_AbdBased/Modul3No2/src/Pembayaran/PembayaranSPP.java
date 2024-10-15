/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pembayaran;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author AbasZ
 */
public class PembayaranSPP extends javax.swing.JFrame {
    
    Icon iconWarning = new javax.swing.ImageIcon(getClass().getResource("warningDanger.png"));
    Icon iconVerified = new javax.swing.ImageIcon(getClass().getResource("verified.png"));

    /**
     * Creates new form PembayaranSPP
     */
    public PembayaranSPP() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    
private List<String> getBulanTertunggak() {
    String keterangan = colStatusSpp.getText();
    List<String> bulanTertunggak = new ArrayList<>();

    if (keterangan.contains("Januari")) bulanTertunggak.add("Januari");
    if (keterangan.contains("Februari")) bulanTertunggak.add("Februari");
    if (keterangan.contains("Maret")) bulanTertunggak.add("Maret");
    if (keterangan.contains("April")) bulanTertunggak.add("April");
    if (keterangan.contains("Mei")) bulanTertunggak.add("Mei");
    if (keterangan.contains("Juni")) bulanTertunggak.add("Juni");
    if (keterangan.contains("Juli")) bulanTertunggak.add("Juli");
    if (keterangan.contains("Agustus")) bulanTertunggak.add("Agustus");
    if (keterangan.contains("September")) bulanTertunggak.add("September");
    if (keterangan.contains("Oktober")) bulanTertunggak.add("Oktober");
    if (keterangan.contains("November")) bulanTertunggak.add("November");
    if (keterangan.contains("Desember")) bulanTertunggak.add("Desember");

    return bulanTertunggak;
}
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        Awalan = new javax.swing.JPanel();
        Alas = new javax.swing.JPanel();
        NamaSiswa = new javax.swing.JLabel();
        colNamaSiswa = new javax.swing.JTextField();
        SPP = new javax.swing.JLabel();
        Pembayaran = new javax.swing.JLabel();
        BtnCekStatusSpp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        colStatusSpp = new javax.swing.JTextArea();
        PanelBulan = new javax.swing.JPanel();
        cbJanuari = new javax.swing.JCheckBox();
        cbFebruari = new javax.swing.JCheckBox();
        cbMaret = new javax.swing.JCheckBox();
        cbApril = new javax.swing.JCheckBox();
        cbMei = new javax.swing.JCheckBox();
        cbJuni = new javax.swing.JCheckBox();
        cbJuli = new javax.swing.JCheckBox();
        cbAgustus = new javax.swing.JCheckBox();
        cbSeptember = new javax.swing.JCheckBox();
        cbOktober = new javax.swing.JCheckBox();
        cbNovember = new javax.swing.JCheckBox();
        cbDesember = new javax.swing.JCheckBox();
        Bulan = new javax.swing.JLabel();
        PanelTotal = new javax.swing.JPanel();
        colTotalSpp = new javax.swing.JTextField();
        BtnTotal = new javax.swing.JButton();
        PanelBayar = new javax.swing.JPanel();
        colPembayaran = new javax.swing.JTextField();
        BtnBayar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRiwayatPembayaran = new javax.swing.JTable();
        Riwayat = new javax.swing.JLabel();
        BtnRiset = new javax.swing.JButton();
        BtnKeluar = new javax.swing.JButton();
        HargaSpp = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Awalan.setBackground(new java.awt.Color(255, 255, 51));
        Awalan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Alas.setBackground(new java.awt.Color(120, 157, 188));
        Alas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NamaSiswa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NamaSiswa.setForeground(new java.awt.Color(255, 255, 255));
        NamaSiswa.setText("Nama Siswa :");
        Alas.add(NamaSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 29, -1, -1));

        colNamaSiswa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Alas.add(colNamaSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 19, 200, 37));

        SPP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SPP.setForeground(new java.awt.Color(255, 255, 255));
        SPP.setText("Jumlah SPP :");
        Alas.add(SPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 202, -1, -1));

        Pembayaran.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Pembayaran.setForeground(new java.awt.Color(255, 255, 255));
        Pembayaran.setText("Pembayaran :");
        Alas.add(Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 200, -1, -1));

        BtnCekStatusSpp.setBackground(new java.awt.Color(51, 255, 51));
        BtnCekStatusSpp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnCekStatusSpp.setForeground(new java.awt.Color(255, 255, 255));
        BtnCekStatusSpp.setText("Cek");
        BtnCekStatusSpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCekStatusSppActionPerformed(evt);
            }
        });
        Alas.add(BtnCekStatusSpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 19, 85, 37));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cek Status SPP :");
        Alas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 29, -1, -1));

        colStatusSpp.setEditable(false);
        colStatusSpp.setColumns(20);
        colStatusSpp.setRows(5);
        jScrollPane2.setViewportView(colStatusSpp);

        Alas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 19, 149, 70));

        PanelBulan.setBackground(new java.awt.Color(120, 157, 188));
        PanelBulan.setLayout(new java.awt.GridBagLayout());

        cbJanuari.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbJanuari.setForeground(new java.awt.Color(255, 255, 255));
        cbJanuari.setText("Januari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        PanelBulan.add(cbJanuari, gridBagConstraints);

        cbFebruari.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbFebruari.setForeground(new java.awt.Color(255, 255, 255));
        cbFebruari.setText("Februari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        PanelBulan.add(cbFebruari, gridBagConstraints);

        cbMaret.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbMaret.setForeground(new java.awt.Color(255, 255, 255));
        cbMaret.setText("Maret");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        PanelBulan.add(cbMaret, gridBagConstraints);

        cbApril.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbApril.setForeground(new java.awt.Color(255, 255, 255));
        cbApril.setText("April");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        PanelBulan.add(cbApril, gridBagConstraints);

        cbMei.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbMei.setForeground(new java.awt.Color(255, 255, 255));
        cbMei.setText("Mei");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        PanelBulan.add(cbMei, gridBagConstraints);

        cbJuni.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbJuni.setForeground(new java.awt.Color(255, 255, 255));
        cbJuni.setText("Juni");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        PanelBulan.add(cbJuni, gridBagConstraints);

        cbJuli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbJuli.setForeground(new java.awt.Color(255, 255, 255));
        cbJuli.setText("Juli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        PanelBulan.add(cbJuli, gridBagConstraints);

        cbAgustus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbAgustus.setForeground(new java.awt.Color(255, 255, 255));
        cbAgustus.setText("Agustus");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        PanelBulan.add(cbAgustus, gridBagConstraints);

        cbSeptember.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbSeptember.setForeground(new java.awt.Color(255, 255, 255));
        cbSeptember.setText("September");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        PanelBulan.add(cbSeptember, gridBagConstraints);

        cbOktober.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbOktober.setForeground(new java.awt.Color(255, 255, 255));
        cbOktober.setText("Oktober");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        PanelBulan.add(cbOktober, gridBagConstraints);

        cbNovember.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbNovember.setForeground(new java.awt.Color(255, 255, 255));
        cbNovember.setText("November");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        PanelBulan.add(cbNovember, gridBagConstraints);

        cbDesember.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbDesember.setForeground(new java.awt.Color(255, 255, 255));
        cbDesember.setText("Desember");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        PanelBulan.add(cbDesember, gridBagConstraints);

        Alas.add(PanelBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 95, 536, 77));

        Bulan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Bulan.setForeground(new java.awt.Color(255, 255, 255));
        Bulan.setText("Bulan :");
        Alas.add(Bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

        PanelTotal.setBackground(new java.awt.Color(120, 157, 188));
        PanelTotal.setLayout(new java.awt.GridLayout(0, 2, 30, 10));

        colTotalSpp.setEditable(false);
        colTotalSpp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PanelTotal.add(colTotalSpp);

        BtnTotal.setBackground(new java.awt.Color(204, 0, 0));
        BtnTotal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnTotal.setForeground(new java.awt.Color(255, 255, 255));
        BtnTotal.setText("Totalkan");
        BtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotalActionPerformed(evt);
            }
        });
        PanelTotal.add(BtnTotal);

        Alas.add(PanelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 190, 224, 40));

        PanelBayar.setBackground(new java.awt.Color(120, 157, 188));
        PanelBayar.setLayout(new java.awt.GridLayout(0, 2, 30, 10));

        colPembayaran.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PanelBayar.add(colPembayaran);

        BtnBayar.setBackground(new java.awt.Color(51, 102, 0));
        BtnBayar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnBayar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBayar.setText("Bayar");
        BtnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBayarActionPerformed(evt);
            }
        });
        PanelBayar.add(BtnBayar);

        Alas.add(PanelBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 230, 40));

        TblRiwayatPembayaran.setBackground(new java.awt.Color(120, 157, 188));
        TblRiwayatPembayaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TblRiwayatPembayaran.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TblRiwayatPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        TblRiwayatPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Siswa", "Bulan", "Total Pembayaran", "Keterangan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblRiwayatPembayaran.setSelectionBackground(new java.awt.Color(255, 255, 255));
        TblRiwayatPembayaran.setShowHorizontalLines(true);
        TblRiwayatPembayaran.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TblRiwayatPembayaran);

        Alas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 660, 130));

        Riwayat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Riwayat.setForeground(new java.awt.Color(255, 255, 255));
        Riwayat.setText("Riwayat Pembayaran");
        Alas.add(Riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        BtnRiset.setBackground(new java.awt.Color(204, 0, 0));
        BtnRiset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnRiset.setForeground(new java.awt.Color(255, 255, 255));
        BtnRiset.setText("Riset");
        BtnRiset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRisetActionPerformed(evt);
            }
        });
        Alas.add(BtnRiset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        BtnKeluar.setBackground(new java.awt.Color(51, 102, 0));
        BtnKeluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        BtnKeluar.setText("Keluar");
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        Alas.add(BtnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        HargaSpp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        HargaSpp.setForeground(new java.awt.Color(255, 255, 255));
        HargaSpp.setText("Harga SPP : 500.000 Perbulan");
        Alas.add(HargaSpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        Awalan.add(Alas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 710, 550));

        Header.setBackground(new java.awt.Color(96, 86, 120));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pembayaran/Wisteria (1).png"))); // NOI18N

        Judul.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Judul.setForeground(new java.awt.Color(255, 255, 255));
        Judul.setText("Pembayaran SPP Wisteria High School");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Judul)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Judul)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Awalan.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 80));

        getContentPane().add(Awalan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void BtnCekStatusSppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCekStatusSppActionPerformed
        // Ambil nama siswa dari colNamaSiswa
        String namaSiswa = colNamaSiswa.getText();
    
        // Cek apakah nama siswa kosong
        if (namaSiswa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama siswa tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE, iconWarning);
            return;
        }

        // data pembayaran, boolean true untuk lunas, false untuk nunggak
        HashMap<String, boolean[]> dataPembayaran = new HashMap<>();
        dataPembayaran.put("Abas", new boolean[]{true, false, true, true, true, false, true, true, true, true, true, true});
        dataPembayaran.put("Mirza", new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true});
        dataPembayaran.put("Anisa", new boolean[]{false, true, true, false, true, true, false, true, true, true, true, true});
        dataPembayaran.put("Fahmi", new boolean[]{true, true, true, true, false, true, true, true, true, true, true, true});

        // Periksa apakah nama siswa ada dalam data
        if (dataPembayaran.containsKey(namaSiswa)) {
            // Ambil status pembayaran untuk siswa tersebut
            boolean[] statusPembayaran = dataPembayaran.get(namaSiswa);

            // Bulan yang akan ditampilkan
            String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

            // StringBuilder untuk menyusun hasil nunggak
            StringBuilder nunggak = new StringBuilder("Nunggak di bulan: ");

            boolean adaTunggakan = false; // Untuk cek apakah ada tunggakan

            // Looping melalui status pembayaran
            for (int i = 0; i < statusPembayaran.length; i++) {
                if (!statusPembayaran[i]) {
                    // Jika nunggak (false), tambahkan bulan ke dalam string
                    nunggak.append(bulan[i]).append(" ");
                    adaTunggakan = true;
                }
            }

            // Cek apakah ada bulan yang nunggak
            if (adaTunggakan) {
                // Tampilkan hasil status bulan yang nunggak
                colStatusSpp.setText(nunggak.toString());
            } else {
                // Jika tidak ada tunggakan
                colStatusSpp.setText("Tidak ada tunggakan. Semua bulan lunas.");
            }

        } else {
            // Jika siswa tidak ditemukan
            colStatusSpp.setText("Siswa tidak ditemukan.");
        }
    }//GEN-LAST:event_BtnCekStatusSppActionPerformed

    private void BtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotalActionPerformed
        // Ambil nama siswa dari text field
        String namaSiswa = colNamaSiswa.getText();

        // Cek apakah nama siswa kosong
        if (namaSiswa.isEmpty()) {
            // Jika nama siswa kosong, tampilkan pesan peringatan
            JOptionPane.showMessageDialog(this, "Nama siswa tidak boleh kosong untuk menghitung total tunggakan!", "Peringatan", JOptionPane.WARNING_MESSAGE, iconWarning);
            return;
        }
        
        // Ambil bulan yang dipilih user
        List<String> bulanDipilih = new ArrayList<>();
        if (cbJanuari.isSelected()) bulanDipilih.add("Januari");
        if (cbFebruari.isSelected()) bulanDipilih.add("Februari");
        if (cbMaret.isSelected()) bulanDipilih.add("Maret");
        if (cbApril.isSelected()) bulanDipilih.add("April");
        if (cbMei.isSelected()) bulanDipilih.add("Mei");
        if (cbJuni.isSelected()) bulanDipilih.add("Juni");
        if (cbJuli.isSelected()) bulanDipilih.add("Juli");
        if (cbAgustus.isSelected()) bulanDipilih.add("Agustus");
        if (cbSeptember.isSelected()) bulanDipilih.add("September");
        if (cbOktober.isSelected()) bulanDipilih.add("Oktober");
        if (cbNovember.isSelected()) bulanDipilih.add("November");
        if (cbDesember.isSelected()) bulanDipilih.add("Desember");

        // Ambil bulan yang tertunggak dari JTextArea
        List<String> bulanTertunggak = getBulanTertunggak();

        // Cek apakah bulan yang dipilih ada dalam bulan yang tertunggak
        for (String bulan : bulanDipilih) {
            if (bulanTertunggak.contains(bulan)) {
            } else {
                JOptionPane.showMessageDialog(this, "Bulan tidak sesuai dengan status tunggakan SPP.", "Peringatan", JOptionPane.WARNING_MESSAGE, iconWarning);
                return;
            }
        }
        
        int hargaSppPerBulan = 500000;
        int totalTunggakan = 0;

        // Hitung total SPP untuk bulan yang dipilih
        for (String bulan : bulanDipilih) {
            totalTunggakan += hargaSppPerBulan;
        }


        // Menampilkan total tunggakan di jumlah spp
        colTotalSpp.setText("Rp " + totalTunggakan);
    }//GEN-LAST:event_BtnTotalActionPerformed

    private void BtnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBayarActionPerformed
        // Ambil nominal bayar dari text field
        String nominalBayarStr = colPembayaran.getText();
        int nominalBayar = Integer.parseInt(nominalBayarStr); // Konversi ke integer

        // Ambil total SPP yang harus dibayar dari colTotalSpp
        String totalSppStr = colTotalSpp.getText().replace("Rp ", "").replace(".", ""); // Hilangkan simbol Rp dan titik
        int totalSpp = Integer.parseInt(totalSppStr); // Konversi ke integer

        // Ambil nama siswa dari col NamaSIswa
        String namaSiswa = colNamaSiswa.getText();

        // Ambil bulan yang dipilih dari checkbox
        String bulan = getBulanDipilih(); // Memanggil Fungsi yang mengumpulkan bulan dari checkbox yang dipilih

        // Cek apakah nominal bayar cukup, kurang, atau lebih
        if (nominalBayar < totalSpp) {
            // Jika uang kurang
            JOptionPane.showMessageDialog(this, "Uang kurang, silakan bayar sesuai jumlah SPP.", "Peringatan", JOptionPane.WARNING_MESSAGE, iconWarning);
        } else {
            // Jika pembayaran berhasil, tambahkan riwayat ke tabel
            String keterangan = "Lunas";

            if (nominalBayar > totalSpp) {
                // Jika ada kembalian, hitung kembalian
                int kembalian = nominalBayar - totalSpp;

                // Tampilkan pesan pembayaran berhasil dan kembalian
                JOptionPane.showMessageDialog(this, "Pembayaran berhasil! Kembalian Anda sebesar Rp " + kembalian, "Informasi", JOptionPane.INFORMATION_MESSAGE, iconVerified);
                keterangan = "Lunas";
            } else {
                // Jika nominal pas
                JOptionPane.showMessageDialog(this, "Pembayaran berhasil!", "Informasi", JOptionPane.INFORMATION_MESSAGE, iconVerified);
            }
            
            // Tambahkan data riwayat ke tabel
            DefaultTableModel model = (DefaultTableModel) TblRiwayatPembayaran.getModel();
            model.insertRow(0, new Object[]{namaSiswa, bulan, "Rp " + totalSppStr, keterangan});
        }
}

// Fungsi untuk mendapatkan bulan yang dipilih dari checkbox
private String getBulanDipilih() {
    StringBuilder bulan = new StringBuilder();
    
    if (cbJanuari.isSelected()) bulan.append("Januari ");
    if (cbFebruari.isSelected()) bulan.append("Februari ");
    if (cbMaret.isSelected()) bulan.append("Maret ");
    if (cbApril.isSelected()) bulan.append("April ");
    if (cbMei.isSelected()) bulan.append("Mei ");
    if (cbJuni.isSelected()) bulan.append("Juni ");
    if (cbJuli.isSelected()) bulan.append("Juli ");
    if (cbAgustus.isSelected()) bulan.append("Agustus ");
    if (cbSeptember.isSelected()) bulan.append("September ");
    if (cbOktober.isSelected()) bulan.append("Oktober ");
    if (cbNovember.isSelected()) bulan.append("November ");
    if (cbDesember.isSelected()) bulan.append("Desember ");
    
    // Menghapus spasi berlebih di awal/akhir
    return bulan.toString().trim();
    }//GEN-LAST:event_BtnBayarActionPerformed

    private void BtnRisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRisetActionPerformed
        colNamaSiswa.setText("");
        colPembayaran.setText("");
        colTotalSpp.setText("");
        colStatusSpp.setText("");

        // Reset checkbox bulan
        cbJanuari.setSelected(false);
        cbFebruari.setSelected(false);
        cbMaret.setSelected(false);
        cbApril.setSelected(false);
        cbMei.setSelected(false);
        cbJuni.setSelected(false);
        cbJuli.setSelected(false);
        cbAgustus.setSelected(false);
        cbSeptember.setSelected(false);
        cbOktober.setSelected(false);
        cbNovember.setSelected(false);
        cbDesember.setSelected(false);
    }//GEN-LAST:event_BtnRisetActionPerformed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alas;
    private javax.swing.JPanel Awalan;
    private javax.swing.JButton BtnBayar;
    private javax.swing.JButton BtnCekStatusSpp;
    private javax.swing.JButton BtnKeluar;
    private javax.swing.JButton BtnRiset;
    private javax.swing.JButton BtnTotal;
    private javax.swing.JLabel Bulan;
    private javax.swing.JLabel HargaSpp;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel NamaSiswa;
    private javax.swing.JPanel PanelBayar;
    private javax.swing.JPanel PanelBulan;
    private javax.swing.JPanel PanelTotal;
    private javax.swing.JLabel Pembayaran;
    private javax.swing.JLabel Riwayat;
    private javax.swing.JLabel SPP;
    private javax.swing.JTable TblRiwayatPembayaran;
    private javax.swing.JCheckBox cbAgustus;
    private javax.swing.JCheckBox cbApril;
    private javax.swing.JCheckBox cbDesember;
    private javax.swing.JCheckBox cbFebruari;
    private javax.swing.JCheckBox cbJanuari;
    private javax.swing.JCheckBox cbJuli;
    private javax.swing.JCheckBox cbJuni;
    private javax.swing.JCheckBox cbMaret;
    private javax.swing.JCheckBox cbMei;
    private javax.swing.JCheckBox cbNovember;
    private javax.swing.JCheckBox cbOktober;
    private javax.swing.JCheckBox cbSeptember;
    private javax.swing.JTextField colNamaSiswa;
    private javax.swing.JTextField colPembayaran;
    private javax.swing.JTextArea colStatusSpp;
    private javax.swing.JTextField colTotalSpp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
