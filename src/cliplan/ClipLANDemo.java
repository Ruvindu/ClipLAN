package cliplan;

import java.awt.AWTException;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Madhushanka
 */
public class ClipLANDemo extends javax.swing.JFrame {

    //app icon
    ImageIcon icon = new ImageIcon("imgs/ciplist_icon.png");
    //button icons
    ImageIcon s = new ImageIcon("imgs/server.png");
    ImageIcon s_active = new ImageIcon("imgs/server_active.png");
    ImageIcon c = new ImageIcon("imgs/client.png");
    ImageIcon c_active = new ImageIcon("imgs/client_active.png");
    ImageIcon h = new ImageIcon("imgs/help.png");
    ImageIcon h_active = new ImageIcon("imgs/help_active.png");
    ImageIcon f = new ImageIcon("imgs/facebook.png");
    ImageIcon f_active = new ImageIcon("imgs/facebook_active.png");
    ImageIcon t = new ImageIcon("imgs/twitter.png");
    ImageIcon t_active = new ImageIcon("imgs/twitter_active.png");

    public ClipLANDemo() {
        initComponents();
        setIconImage(icon.getImage());

        ipfinder.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        footer = new javax.swing.JLabel();
        server_navi = new javax.swing.JLabel();
        client_navi = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        panel_platform = new javax.swing.JPanel();
        server_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        connected_clients_label = new javax.swing.JLabel();
        server_status = new javax.swing.JLabel();
        start_toggle = new javax.swing.JButton();
        server_errors = new javax.swing.JLabel();
        server_port = new javax.swing.JTextField();
        server_ip = new javax.swing.JTextField();
        client_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        client_status = new javax.swing.JLabel();
        connect_toggle = new javax.swing.JButton();
        client_errors = new javax.swing.JLabel();
        input_port = new javax.swing.JTextField();
        input_ip = new javax.swing.JTextField();
        refresh_rate = new javax.swing.JSpinner();
        help_and_about = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        client_status1 = new javax.swing.JLabel();
        client_errors1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        weblink = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setTitle("ClipLAN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setText("Copyright © 2021 Snap Ruu Creations");

        server_navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/server_50px_blue.png"))); // NOI18N
        server_navi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        server_navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                server_naviMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                server_naviMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                server_naviMouseExited(evt);
            }
        });

        client_navi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/thin_client_blue50px.png"))); // NOI18N
        client_navi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_navi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_naviMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                client_naviMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                client_naviMouseExited(evt);
            }
        });

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/help.png"))); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });

        panel_platform.setBackground(new java.awt.Color(255, 255, 255));
        panel_platform.setLayout(new java.awt.CardLayout());

        server_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Server Ip Address & Port");

        jLabel4.setText("Connected Clients ");

        jLabel5.setText("Server Status");

        connected_clients_label.setForeground(new java.awt.Color(38, 141, 245));
        connected_clients_label.setText("0");

        server_status.setForeground(new java.awt.Color(102, 102, 102));
        server_status.setText("Offline");

        start_toggle.setText("Start Sever");
        start_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_toggleActionPerformed(evt);
            }
        });

        server_errors.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        server_errors.setForeground(new java.awt.Color(255, 102, 102));

        server_port.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        server_port.setForeground(new java.awt.Color(38, 141, 245));
        server_port.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        server_port.setText("2123");

        server_ip.setEditable(false);
        server_ip.setBackground(new java.awt.Color(255, 255, 255));
        server_ip.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        server_ip.setForeground(new java.awt.Color(38, 141, 245));
        server_ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        server_ip.setBorder(null);

        javax.swing.GroupLayout server_panelLayout = new javax.swing.GroupLayout(server_panel);
        server_panel.setLayout(server_panelLayout);
        server_panelLayout.setHorizontalGroup(
            server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(server_panelLayout.createSequentialGroup()
                        .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(server_errors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(server_panelLayout.createSequentialGroup()
                                .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(server_status, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(connected_clients_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, server_panelLayout.createSequentialGroup()
                        .addGap(0, 106, Short.MAX_VALUE)
                        .addComponent(start_toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(server_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(server_ip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, server_panelLayout.createSequentialGroup()
                        .addComponent(server_port, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        server_panelLayout.setVerticalGroup(
            server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(server_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(server_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(server_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(server_status, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(server_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(connected_clients_label))
                .addGap(39, 39, 39)
                .addComponent(start_toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(server_errors, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_platform.add(server_panel, "card2");

        client_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Enter Server Ip Address & Port");

        jLabel9.setText("Refresh rate");

        jLabel17.setText("Client status");

        jLabel18.setForeground(new java.awt.Color(38, 141, 245));
        jLabel18.setText("Seconds");

        client_status.setForeground(new java.awt.Color(102, 102, 102));
        client_status.setText("Disconnected");

        connect_toggle.setText("Connect");
        connect_toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_toggleActionPerformed(evt);
            }
        });

        client_errors.setForeground(new java.awt.Color(255, 102, 102));

        input_port.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        input_port.setForeground(new java.awt.Color(38, 141, 245));
        input_port.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_port.setText("2123");

        input_ip.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        input_ip.setForeground(new java.awt.Color(38, 141, 245));
        input_ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        refresh_rate.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        refresh_rate.setEditor(new javax.swing.JSpinner.NumberEditor(refresh_rate, ""));

        javax.swing.GroupLayout client_panelLayout = new javax.swing.GroupLayout(client_panel);
        client_panel.setLayout(client_panelLayout);
        client_panelLayout.setHorizontalGroup(
            client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(client_panelLayout.createSequentialGroup()
                        .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(client_errors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(client_panelLayout.createSequentialGroup()
                                .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(client_status, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(client_panelLayout.createSequentialGroup()
                                        .addComponent(refresh_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_panelLayout.createSequentialGroup()
                        .addGap(0, 106, Short.MAX_VALUE)
                        .addComponent(connect_toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
            .addGroup(client_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_ip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_panelLayout.createSequentialGroup()
                        .addComponent(input_port, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        client_panelLayout.setVerticalGroup(
            client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(input_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(client_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(client_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18)
                    .addComponent(refresh_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(connect_toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(client_errors, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_platform.add(client_panel, "card2");

        help_and_about.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Help & About");

        jLabel19.setFont(new java.awt.Font("Sitka Text", 0, 13)); // NOI18N
        jLabel19.setText("Version");

        client_status1.setFont(new java.awt.Font("Sitka Text", 0, 13)); // NOI18N
        client_status1.setForeground(new java.awt.Color(102, 102, 102));
        client_status1.setText("1.1V");

        client_errors1.setForeground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 13)); // NOI18N
        jLabel1.setText("ClipLAN - It makes feel your all computers as a one");

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/facebook.png"))); // NOI18N
        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facebookMouseExited(evt);
            }
        });

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/twitter.png"))); // NOI18N
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twitterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                twitterMouseExited(evt);
            }
        });

        weblink.setFont(new java.awt.Font("Sitka Text", 0, 13)); // NOI18N
        weblink.setForeground(new java.awt.Color(38, 141, 245));
        weblink.setText("https://www.snapruu.com/cliplan#help");
        weblink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        weblink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weblinkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout help_and_aboutLayout = new javax.swing.GroupLayout(help_and_about);
        help_and_about.setLayout(help_and_aboutLayout);
        help_and_aboutLayout.setHorizontalGroup(
            help_and_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(help_and_aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(help_and_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(client_errors1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addGroup(help_and_aboutLayout.createSequentialGroup()
                        .addGroup(help_and_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(help_and_aboutLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(client_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(help_and_aboutLayout.createSequentialGroup()
                                .addComponent(facebook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(twitter))
                            .addComponent(weblink, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        help_and_aboutLayout.setVerticalGroup(
            help_and_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(help_and_aboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(help_and_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(client_status1))
                .addGap(18, 18, 18)
                .addGroup(help_and_aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weblink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(client_errors1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_platform.add(help_and_about, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_platform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(server_navi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(client_navi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(help)))
                .addContainerGap())
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(server_navi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(client_navi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panel_platform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(footer)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Client client;
    boolean server_now = false;
    static boolean client_now = false;
    static String loopbackAddress, netAddress;

    Thread ipfinder = new Thread() {

        private String alternative_ip() {
            Enumeration<NetworkInterface> net_interfaces;
            try {
                net_interfaces = NetworkInterface.getNetworkInterfaces();

                while (net_interfaces.hasMoreElements()) {
                    NetworkInterface nextElement = net_interfaces.nextElement();

                    if (nextElement.isUp()) {

                        if (nextElement.isLoopback()) {
                            nextElement.getInterfaceAddresses().iterator().forEachRemaining((t) -> {
                                if (t.getAddress().getHostAddress().matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$")) {
                                    loopbackAddress = t.getAddress().getHostAddress();
                                }
                            });
                        } else {
                            nextElement.getInterfaceAddresses().iterator().forEachRemaining((t) -> {
                                if (t.getAddress().getHostAddress().matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$")) {
                                    netAddress = t.getAddress().getHostAddress();
                                }
                            });
                        }
                    }

                }

            } catch (SocketException e) {

            }

            if (null != netAddress) {
                return netAddress;
            } else {
                return loopbackAddress;
            }
        }

        @Override
        public void run() {

            try {
                String host_address = InetAddress.getLocalHost().getHostAddress();
                if (host_address.matches("\"^((0|1\\\\d?\\\\d?|2[0-4]?\\\\d?|25[0-5]?|[3-9]\\\\d?)\\\\.){3}(0|1\\\\d?\\\\d?|2[0-4]?\\\\d?|25[0-5]?|[3-9]\\\\d?)$\"")) {
                    input_ip.setText(host_address);
                } else {
                    input_ip.setText(this.alternative_ip());
                }
            } catch (UnknownHostException ex) {
                Logger.getLogger(ClipLANDemo.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (!server_now) {
                try {
                    String host_address = InetAddress.getLocalHost().getHostAddress();
                    if (host_address.matches("\"^((0|1\\\\d?\\\\d?|2[0-4]?\\\\d?|25[0-5]?|[3-9]\\\\d?)\\\\.){3}(0|1\\\\d?\\\\d?|2[0-4]?\\\\d?|25[0-5]?|[3-9]\\\\d?)$\"")) {
                        server_ip.setText(host_address);
                    } else {
                        server_ip.setText(this.alternative_ip());
                    }

                    Thread.sleep(2500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ClipLANDemo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(ClipLANDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    };

    ClipLAN scl;
    Registry reg;
    //server
    Thread server = new Thread() {
        @Override
        public void run() {
            server_errors.setText("");
            try {
                scl = new ClipLANService(main_window);
                reg = LocateRegistry.createRegistry(Integer.parseInt(server_port.getText()));
                reg.bind("cliplan.com", scl);

                server_now = true;

                server_status.setText("Online");
                server_status.setForeground(new java.awt.Color(160, 245, 38));
                start_toggle.setText("Shutdown Server");

                server_port.setEnabled(false);

            } catch (NumberFormatException | AlreadyBoundException | RemoteException e) {
                server_errors.setText("<html>" + e.getMessage() + "</html>");

            }

        }
    };


    private void server_naviMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_server_naviMouseEntered
        server_navi.setIcon(s_active);
    }//GEN-LAST:event_server_naviMouseEntered

    private void server_naviMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_server_naviMouseExited
        server_navi.setIcon(s);
    }//GEN-LAST:event_server_naviMouseExited

    private void client_naviMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_naviMouseEntered
        client_navi.setIcon(c_active);
    }//GEN-LAST:event_client_naviMouseEntered

    private void client_naviMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_naviMouseExited
        client_navi.setIcon(c);
    }//GEN-LAST:event_client_naviMouseExited

    private void server_naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_server_naviMouseClicked
        panel_platform.removeAll();
        panel_platform.repaint();
        panel_platform.revalidate();
        server_errors.setText("");
        panel_platform.add(this.server_panel);
        panel_platform.repaint();
        panel_platform.revalidate();
    }//GEN-LAST:event_server_naviMouseClicked

    private void client_naviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_naviMouseClicked
        panel_platform.removeAll();
        panel_platform.repaint();
        panel_platform.revalidate();
        client_errors.setText("");
        panel_platform.add(this.client_panel);
        panel_platform.repaint();
        panel_platform.revalidate();
    }//GEN-LAST:event_client_naviMouseClicked

    private void start_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_toggleActionPerformed
        server_errors.setText("");

        if ("Offline".equals(server_status.getText())) {
            if (server_port.getText().length() == 4) {
                try {
                    Integer.parseInt(server_port.getText());
                    server.start();
                } catch (Exception e) {
                    server_errors.setText("<html>Exception ocured : " + e.getMessage() + "</html>");
                }

            } else {
                server_errors.setText("<html>Invalid port number.</html>");
            }
        } else {

            System.exit(0);
        }
    }//GEN-LAST:event_start_toggleActionPerformed

    private String input_validate(String str_ip, String str_port) {
        String errors = "";
        //validation

        try {
            int ref = (int) refresh_rate.getValue();
        } catch (Exception e) {
            errors = "<html>Invalid refresh rate</html>";
        }
        if (str_port.length() != 4) {
            errors = "<html>Invalid port number.</html>";
        }
        try {
            int port = Integer.parseInt(str_port); //port type validation
        } catch (NumberFormatException e) {
            errors = "<html>Invalid port number.</html>";
        }
        if (!str_ip.matches("^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$")) {
            errors = "<html>Invalid ip address.</html>";
        }

        try {
            InetAddress is_connecteble = InetAddress.getByName(str_ip);
            boolean reachable = is_connecteble.isReachable(1000);

            if (!reachable) {
                errors = "<html>" + str_ip + " : Destination host unreachable</html>";
            }
        } catch (IOException e) {
            errors = "<html>" + e.getMessage() + "</html>";
        }

        return errors;
    }


    private void connect_toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_toggleActionPerformed
        client_errors.setText("");

        if ("Disconnected".equals(client_status.getText())) {

            String str_ip = input_ip.getText();
            String str_port = input_port.getText();

            String errors = this.input_validate(str_ip, str_port);

            if ("".equals(errors)) {

                try {
                    int port = Integer.parseInt(str_port);
                    int ref = (int) refresh_rate.getValue();

                    //create new client
                    client = new Client(ref, str_ip, port);

                    client.connect();
                    //client.ccl.connect_me(client);
                    client.start();
                    client_status.setText("Connected");
                    client_status.setForeground(new java.awt.Color(160, 245, 38));
                    connect_toggle.setText("Disconnect");

                    input_ip.setEnabled(false);
                    input_port.setEnabled(false);
                    refresh_rate.setEnabled(false);

                    client_now = true;

                } catch (AlreadyConnectedException | NumberFormatException | NotBoundException | RemoteException e) {
                    client_errors.setText("<html>" + e.getMessage() + "</html>");
                }

            } else {
                client_errors.setText(errors); // show validation errors
            }
        } else {
            try {
                client.disconnect();
                //client.ccl.disconnect_me(client);
                client_status.setText("Disconnected");
                client_status.setForeground(new java.awt.Color(102, 102, 102));
                connect_toggle.setText("Connect");

                input_ip.setEnabled(true);
                input_port.setEnabled(true);
                refresh_rate.setEnabled(true);

                client_now = false;

            } catch (NotBoundException | RemoteException e) {
                client_errors.setText("<html>" + e.getMessage() + "</html>");
            }
        }
    }//GEN-LAST:event_connect_toggleActionPerformed

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
        help.setIcon(h_active);
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
        help.setIcon(h);
    }//GEN-LAST:event_helpMouseExited

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        panel_platform.removeAll();
        panel_platform.repaint();
        panel_platform.revalidate();
        panel_platform.add(this.help_and_about);
        panel_platform.repaint();
        panel_platform.revalidate();
    }//GEN-LAST:event_helpMouseClicked

    private void facebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseEntered
        facebook.setIcon(f_active);
    }//GEN-LAST:event_facebookMouseEntered

    private void facebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseExited
        facebook.setIcon(f);
    }//GEN-LAST:event_facebookMouseExited

    private void twitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseEntered
        twitter.setIcon(t_active);
    }//GEN-LAST:event_twitterMouseEntered

    private void twitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseExited
        twitter.setIcon(t);
    }//GEN-LAST:event_twitterMouseExited

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        String url_open = "https://www.facebook.com/snapruu.official";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "URL could not open", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_facebookMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        String url_open = "https://twitter.com/RuuSnap";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "URL could not open", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_twitterMouseClicked

    private void weblinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weblinkMouseClicked
        String url_open = "https://www.facebook.com/snapruu.official";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "URL could not open", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_weblinkMouseClicked

    public static void disconnect_client_when_close() {
        if (client_now) {
            JOptionPane.showMessageDialog(null, "Client is still connected, disconnect it before close.  ", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.exit(0);
        }
    }

    public static ClipLANDemo main_window;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClipLANDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClipLANDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClipLANDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClipLANDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main_window = new ClipLANDemo();
                main_window.setVisible(true);

//                main_window.addWindowListener(new WindowAdapter() {
//                    public void windowClosing(WindowEvent evt) {
//                        disconnect_client_when_close();
//                    }
//                });
                PopupMenu popup = new PopupMenu();
                TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("imgs/ciplist_icon_tray.png"));
                trayIcon.setImageAutoSize(true);
                SystemTray tray = SystemTray.getSystemTray();

                // Create a pop-up menu components
                MenuItem openItem = new MenuItem("Open ClipLAN");
                MenuItem hideItem = new MenuItem("Hide ClipLAN");
                MenuItem exitItem = new MenuItem("Exit");

                //popup menu actions
                openItem.addActionListener((e) -> {
                    main_window.setVisible(true);
                    openItem.setEnabled(false);
                    hideItem.setEnabled(true);
                    //main_window.setAlwaysOnTop(true);
                });

                hideItem.addActionListener((e) -> {
                    main_window.setVisible(false);
                    hideItem.setEnabled(false);
                    openItem.setEnabled(true);
                    //main_window.setAlwaysOnTop(true);
                });

                exitItem.addActionListener((e) -> {
                    disconnect_client_when_close();
                });

                openItem.setEnabled(false);
                //Add components to pop-up menu
                popup.add(openItem);
                popup.add(hideItem);
                popup.add(exitItem);

                trayIcon.setPopupMenu(popup);

                //tray icon acction
                trayIcon.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseReleased(e);

                        if (e.getClickCount() == 2) {
                            main_window.setVisible(true);
                            openItem.setEnabled(false);
                            hideItem.setEnabled(true);
                        }
                        //main_window.setAlwaysOnTop(true);
                    }
                });

                try {
                    tray.add(trayIcon);
                } catch (AWTException e) {
                    System.out.println("TrayIcon could not be added.");
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel client_errors;
    private javax.swing.JLabel client_errors1;
    private javax.swing.JLabel client_navi;
    private javax.swing.JPanel client_panel;
    private javax.swing.JLabel client_status;
    private javax.swing.JLabel client_status1;
    private javax.swing.JButton connect_toggle;
    public javax.swing.JLabel connected_clients_label;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel help;
    private javax.swing.JPanel help_and_about;
    private javax.swing.JTextField input_ip;
    private javax.swing.JTextField input_port;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_platform;
    private javax.swing.JSpinner refresh_rate;
    private javax.swing.JLabel server_errors;
    private javax.swing.JTextField server_ip;
    private javax.swing.JLabel server_navi;
    private javax.swing.JPanel server_panel;
    private javax.swing.JTextField server_port;
    private javax.swing.JLabel server_status;
    private javax.swing.JButton start_toggle;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel weblink;
    // End of variables declaration//GEN-END:variables
}
