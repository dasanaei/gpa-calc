import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.JTextField;
import java.util.prefs.Preferences;
public class Settings extends javax.swing.JFrame {
 Preferences pref = Preferences.userNodeForPackage(Settings.class);
 private int t = 0;
 private int t1 = 0;
 private int t2 = 0;
 private int t3 = 0;
 private int t4 = 0;
 private int t5 = 0;
 private int c = 0;
 private int c1 = 0;
 private int c2 = 0;
 private int c3 = 0;
 private int c4 = 0;
 private int c5 = 0;
 

            

    public Settings() {
        initComponents();
        Title.setText(pref.get("Title1", "Welcome to GPA Calculator 2.0"));
        setup();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Textbox = new javax.swing.JTextField();
        Done = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        creditField = new javax.swing.JTextField();
        creditField1 = new javax.swing.JTextField();
        Textbox1 = new javax.swing.JTextField();
        creditField2 = new javax.swing.JTextField();
        Textbox2 = new javax.swing.JTextField();
        Textbox4 = new javax.swing.JTextField();
        Textbox3 = new javax.swing.JTextField();
        Textbox5 = new javax.swing.JTextField();
        creditField3 = new javax.swing.JTextField();
        creditField4 = new javax.swing.JTextField();
        creditField5 = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        Dante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cumGPA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        totCredits = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Textbox.setForeground(new java.awt.Color(153, 153, 153));
        Textbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textbox.setText("Enter Class");
        Textbox.setActionCommand("<Not Set>");
        Textbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextboxFocusGained(evt);
            }
        });
        Textbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextboxMouseClicked(evt);
            }
        });
        Textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextboxActionPerformed(evt);
            }
        });
        Textbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextboxKeyPressed(evt);
            }
        });

        Done.setBackground(new java.awt.Color(0, 51, 255));
        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        Label.setText("Classes");

        Clear.setBackground(new java.awt.Color(255, 0, 0));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Credits");

        creditField.setForeground(new java.awt.Color(153, 153, 153));
        creditField.setText("0");
        creditField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditFieldFocusLost(evt);
            }
        });
        creditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditFieldActionPerformed(evt);
            }
        });
        creditField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditFieldKeyTyped(evt);
            }
        });

        creditField1.setForeground(new java.awt.Color(153, 153, 153));
        creditField1.setText("0");
        creditField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditField1FocusLost(evt);
            }
        });
        creditField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditField1ActionPerformed(evt);
            }
        });
        creditField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditField1KeyTyped(evt);
            }
        });

        Textbox1.setForeground(new java.awt.Color(153, 153, 153));
        Textbox1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textbox1.setText("Enter Class");
        Textbox1.setActionCommand("<Not Set>");
        Textbox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Textbox1FocusGained(evt);
            }
        });
        Textbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Textbox1MouseClicked(evt);
            }
        });
        Textbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textbox1ActionPerformed(evt);
            }
        });
        Textbox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textbox1KeyPressed(evt);
            }
        });

        creditField2.setForeground(new java.awt.Color(153, 153, 153));
        creditField2.setText("0");
        creditField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditField2FocusLost(evt);
            }
        });
        creditField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditField2ActionPerformed(evt);
            }
        });
        creditField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditField2KeyTyped(evt);
            }
        });

        Textbox2.setForeground(new java.awt.Color(153, 153, 153));
        Textbox2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textbox2.setText("Enter Class");
        Textbox2.setActionCommand("<Not Set>");
        Textbox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Textbox2FocusGained(evt);
            }
        });
        Textbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Textbox2MouseClicked(evt);
            }
        });
        Textbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textbox2ActionPerformed(evt);
            }
        });
        Textbox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textbox2KeyPressed(evt);
            }
        });

        Textbox4.setForeground(new java.awt.Color(153, 153, 153));
        Textbox4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textbox4.setText("Enter Class");
        Textbox4.setActionCommand("<Not Set>");
        Textbox4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Textbox4FocusGained(evt);
            }
        });
        Textbox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Textbox4MouseClicked(evt);
            }
        });
        Textbox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textbox4ActionPerformed(evt);
            }
        });
        Textbox4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textbox4KeyPressed(evt);
            }
        });

        Textbox3.setForeground(new java.awt.Color(153, 153, 153));
        Textbox3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textbox3.setText("Enter Class");
        Textbox3.setActionCommand("<Not Set>");
        Textbox3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Textbox3FocusGained(evt);
            }
        });
        Textbox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Textbox3MouseClicked(evt);
            }
        });
        Textbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textbox3ActionPerformed(evt);
            }
        });
        Textbox3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textbox3KeyPressed(evt);
            }
        });

        Textbox5.setForeground(new java.awt.Color(153, 153, 153));
        Textbox5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textbox5.setText("Enter Class");
        Textbox5.setActionCommand("<Not Set>");
        Textbox5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Textbox5FocusGained(evt);
            }
        });
        Textbox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Textbox5MouseClicked(evt);
            }
        });
        Textbox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textbox5ActionPerformed(evt);
            }
        });
        Textbox5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textbox5KeyPressed(evt);
            }
        });

        creditField3.setForeground(new java.awt.Color(153, 153, 153));
        creditField3.setText("0");
        creditField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditField3FocusLost(evt);
            }
        });
        creditField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditField3ActionPerformed(evt);
            }
        });
        creditField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditField3KeyTyped(evt);
            }
        });

        creditField4.setForeground(new java.awt.Color(153, 153, 153));
        creditField4.setText("0");
        creditField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditField4FocusLost(evt);
            }
        });
        creditField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditField4ActionPerformed(evt);
            }
        });
        creditField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditField4KeyTyped(evt);
            }
        });

        creditField5.setForeground(new java.awt.Color(153, 153, 153));
        creditField5.setText("0");
        creditField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                creditField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                creditField5FocusLost(evt);
            }
        });
        creditField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditField5ActionPerformed(evt);
            }
        });
        creditField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditField5KeyTyped(evt);
            }
        });

        Title.setFont(new java.awt.Font("Silom", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Settings");

        Dante.setBackground(new java.awt.Color(0, 204, 0));
        Dante.setText("Dante");
        Dante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanteActionPerformed(evt);
            }
        });

        jLabel2.setText(" Current Cumulative GPA:");

        cumGPA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cumGPAFocusLost(evt);
            }
        });
        cumGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cumGPAActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Credits Taken:");

        totCredits.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                totCreditsFocusLost(evt);
            }
        });
        totCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totCreditsActionPerformed(evt);
            }
        });
        totCredits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totCreditsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Clear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Dante, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(Label))
                                .addComponent(Textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Textbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Textbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Textbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Textbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Textbox5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(86, 86, 86)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(creditField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(creditField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(creditField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(creditField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(creditField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(creditField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(Done, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cumGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(7, 7, 7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textbox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cumGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Done)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Clear)
                    .addComponent(Dante))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextboxActionPerformed
    Textbox1.setText("");
        
    }//GEN-LAST:event_TextboxActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
    pref.put("Class", Textbox.getText());
    pref.put("Class1", Textbox1.getText());
    pref.put("Class2", Textbox2.getText());
    pref.put("Class3", Textbox3.getText());
    pref.put("Class4", Textbox4.getText());
    pref.put("Class5", Textbox5.getText());
    
    pref.put("Credit", creditField.getText());
    pref.put("Credit1", creditField1.getText());
    pref.put("Credit2", creditField2.getText());
    pref.put("Credit3", creditField3.getText());
    pref.put("Credit4", creditField4.getText());
    pref.put("Credit5", creditField5.getText());
    
    pref.put("cumGPA", cumGPA.getText());
    pref.put("totCredit", totCredits.getText());
    
    pref.put("Title1", "Settings");
    
    new gpaCalculator().setVisible(true);
    this.setVisible(false);

    }//GEN-LAST:event_DoneActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Textbox.setText("Enter Class");
        Textbox1.setText("Enter Class");
        Textbox2.setText("Enter Class");
        Textbox3.setText("Enter Class");
        Textbox4.setText("Enter Class");
        Textbox5.setText("Enter Class");
        
        creditField.setText("0");
        creditField1.setText("0");
        creditField2.setText("0");
        creditField3.setText("0");
        creditField4.setText("0");
        creditField5.setText("0");
        
        cumGPA.setText("");
        totCredits.setText("");
        
          Textbox.setForeground(Color.GRAY);
            creditField.setForeground(Color.GRAY);
              Textbox1.setForeground(Color.GRAY);
            creditField1.setForeground(Color.GRAY);
              Textbox2.setForeground(Color.GRAY);
            creditField2.setForeground(Color.GRAY);
              Textbox3.setForeground(Color.GRAY);
            creditField3.setForeground(Color.GRAY);
             Textbox4.setForeground(Color.GRAY);
            creditField4.setForeground(Color.GRAY);
              Textbox5.setForeground(Color.GRAY);
            creditField5.setForeground(Color.GRAY);
            
   t = 0;
   t1 = 0;
   t2 = 0;
   t3 = 0;
   t4 = 0;
   t5 = 0;
   c = 0;
   c1 = 0;
   c2 = 0;
   c3 = 0;
   c4 = 0;
   c5 = 0;
    }//GEN-LAST:event_ClearActionPerformed

    private void creditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditFieldActionPerformed
    }//GEN-LAST:event_creditFieldActionPerformed

    private void creditFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditFieldKeyTyped
char vChar = evt.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }  
                           creditField.setForeground(Color.BLACK);
// TODO add your        // TODO add your handling code here:
    }//GEN-LAST:event_creditFieldKeyTyped

    private void creditField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditField1ActionPerformed

    private void creditField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditField1KeyTyped
    creditField1.setForeground(Color.BLACK);
    char vChar = evt.getKeyChar();
     if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }          }//GEN-LAST:event_creditField1KeyTyped

    private void Textbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textbox1ActionPerformed
    Textbox2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox1ActionPerformed

    private void creditField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditField2ActionPerformed

    private void creditField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditField2KeyTyped
    creditField2.setForeground(Color.BLACK);

        char vChar = evt.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }          }//GEN-LAST:event_creditField2KeyTyped

    private void Textbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox2ActionPerformed

    private void Textbox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textbox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox4ActionPerformed

    private void Textbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textbox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox3ActionPerformed

    private void Textbox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textbox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox5ActionPerformed

    private void creditField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditField3ActionPerformed

    private void creditField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditField3KeyTyped
    creditField3.setForeground(Color.BLACK);

        char vChar = evt.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }          }//GEN-LAST:event_creditField3KeyTyped

    private void creditField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditField4ActionPerformed

    private void creditField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditField4KeyTyped
    creditField4.setForeground(Color.BLACK);

        char vChar = evt.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }          }//GEN-LAST:event_creditField4KeyTyped

    private void creditField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditField5ActionPerformed

    private void creditField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditField5KeyTyped
    creditField5.setForeground(Color.BLACK);

        char vChar = evt.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }          }//GEN-LAST:event_creditField5KeyTyped

    private void DanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanteActionPerformed
     
        Textbox.setText("MA 261");
    Textbox1.setText("CS 159");
    Textbox2.setText("COM 114");
    Textbox3.setText("CGT 163");
    Textbox4.setText("ENGR 131");
    
    Textbox.setForeground(Color.BLACK);
    Textbox1.setForeground(Color.BLACK);
    Textbox2.setForeground(Color.BLACK);
    Textbox3.setForeground(Color.BLACK);
    Textbox4.setForeground(Color.BLACK);
    
    creditField.setText("4");
    creditField1.setText("3");
    creditField2.setText("3");
    creditField3.setText("2");
    creditField4.setText("2");
    
    creditField.setForeground(Color.BLACK);
    creditField1.setForeground(Color.BLACK);
    creditField2.setForeground(Color.BLACK);
    creditField3.setForeground(Color.BLACK);
    creditField4.setForeground(Color.BLACK);

    
    
    
    cumGPA.setText("3.84");
    totCredits.setText("15");

    }//GEN-LAST:event_DanteActionPerformed

    private void TextboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextboxMouseClicked
    if (t == 0){
      Textbox.selectAll();
      t++;
    }
    }//GEN-LAST:event_TextboxMouseClicked

    private void Textbox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Textbox1MouseClicked
    if (t1 == 0){
      Textbox1.selectAll();
      t1++;
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox1MouseClicked

    private void Textbox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Textbox2MouseClicked
    if (t2 == 0){
      Textbox2.selectAll();
      t2++;
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox2MouseClicked

    private void Textbox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Textbox3MouseClicked
    if (t3 == 0){
      Textbox3.selectAll();
      t3++;
    }
    }//GEN-LAST:event_Textbox3MouseClicked

    private void Textbox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Textbox4MouseClicked
    if (t4 == 0){
      Textbox4.selectAll();
      t4++;
    }
    }//GEN-LAST:event_Textbox4MouseClicked

    private void Textbox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Textbox5MouseClicked
    if (t5 == 0){
      Textbox5.selectAll();
      t5++;
    }
    }//GEN-LAST:event_Textbox5MouseClicked

    private void Textbox3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textbox3FocusGained
if (t3 == 0){
      Textbox3.selectAll();
      t3++;
    }        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox3FocusGained

    private void TextboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextboxFocusGained
if (t == 0){
      Textbox.selectAll();
      t++;
    }          }//GEN-LAST:event_TextboxFocusGained

    private void Textbox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textbox1FocusGained
if (t1 == 0){
      Textbox1.selectAll();
      t1++;
    }              // TODO add your handling code here:
    }//GEN-LAST:event_Textbox1FocusGained

    private void Textbox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textbox2FocusGained
if (t2 == 0){
      Textbox2.selectAll();
      t2++;
    }              // TODO add your handling code here:
    }//GEN-LAST:event_Textbox2FocusGained

    private void Textbox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textbox4FocusGained
if (t4 == 0){
      Textbox4.selectAll();
      t4++;
    }              // TODO add your handling code here:
    }//GEN-LAST:event_Textbox4FocusGained

    private void Textbox5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textbox5FocusGained
if (t5 == 0){
      Textbox5.selectAll();
      t5++;
    }              // TODO add your handling code here:
    }//GEN-LAST:event_Textbox5FocusGained

    private void creditField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField1FocusGained
if (c1 == 0){
      creditField1.selectAll();
      c1++;
    }    }//GEN-LAST:event_creditField1FocusGained

    private void creditFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditFieldFocusGained
if (c == 0){
      creditField.selectAll();
      c++;
    }        // TODO add your handling code here:
    }//GEN-LAST:event_creditFieldFocusGained

    private void creditField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField2FocusGained
if (c2 == 0){
      creditField2.selectAll();
      c2++;
    }        // TODO add your handling code here:
    }//GEN-LAST:event_creditField2FocusGained

    private void creditField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField3FocusGained
     if (c3 == 0){
      creditField3.selectAll();
      c3++;
    }   // TODO add your handling code here:
    }//GEN-LAST:event_creditField3FocusGained

    private void creditField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField4FocusGained
if (c4 == 0){
      creditField4.selectAll();
      c4++;
    }        // TODO add your handling code here:
    }//GEN-LAST:event_creditField4FocusGained

    private void creditField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField5FocusGained
        if (c5 == 0){
      creditField5.selectAll();
      c5++;
    }// TODO add your handling code here:
    }//GEN-LAST:event_creditField5FocusGained

    private void TextboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextboxKeyPressed
       Textbox.setForeground(Color.BLACK);
    }//GEN-LAST:event_TextboxKeyPressed

    private void Textbox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textbox1KeyPressed
       Textbox1.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox1KeyPressed

    private void Textbox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textbox2KeyPressed
       Textbox2.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox2KeyPressed

    private void Textbox3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textbox3KeyPressed
           Textbox3.setForeground(Color.BLACK);
    // TODO add your handling code here:
    }//GEN-LAST:event_Textbox3KeyPressed

    private void Textbox4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textbox4KeyPressed
       Textbox4.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox4KeyPressed

    private void Textbox5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textbox5KeyPressed
       Textbox5.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_Textbox5KeyPressed

    private void cumGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cumGPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cumGPAActionPerformed

    private void totCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totCreditsActionPerformed

    private void totCreditsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totCreditsKeyTyped
    creditField1.setForeground(Color.BLACK);
    char vChar = evt.getKeyChar();
     if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }         }//GEN-LAST:event_totCreditsKeyTyped

    private void creditFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditFieldFocusLost
        if (creditField.getText().equalsIgnoreCase("")){
            creditField.setText("0");
        }
    }//GEN-LAST:event_creditFieldFocusLost

    private void creditField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField1FocusLost
        if (creditField1.getText().equalsIgnoreCase("")){
            creditField1.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_creditField1FocusLost

    private void creditField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField2FocusLost
          if (creditField2.getText().equalsIgnoreCase("")){
            creditField2.setText("0");
        }      // TODO add your handling code here:
    }//GEN-LAST:event_creditField2FocusLost

    private void creditField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField3FocusLost
         if (creditField3.getText().equalsIgnoreCase("")){
            creditField3.setText("0");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_creditField3FocusLost

    private void creditField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField4FocusLost
        if (creditField4.getText().equalsIgnoreCase("")){
            creditField4.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_creditField4FocusLost

    private void creditField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_creditField5FocusLost
        if (creditField5.getText().equalsIgnoreCase("")){
            creditField5.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_creditField5FocusLost

    private void cumGPAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cumGPAFocusLost
    if (cumGPA.getText().equalsIgnoreCase("")){
            cumGPA.setText("0");
        }      // TODO add your handling code here:   // TODO add your handling code here:
    }//GEN-LAST:event_cumGPAFocusLost

    private void totCreditsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totCreditsFocusLost
   if (totCredits.getText().equalsIgnoreCase("")){
            totCredits.setText("0");}        // TODO add your handling code here:
    }//GEN-LAST:event_totCreditsFocusLost

    private void setup(){
        Textbox.setText(pref.get("Class","Enter class"));
        Textbox1.setText(pref.get("Class1","Enter class"));
        Textbox2.setText(pref.get("Class2","Enter class"));
        Textbox3.setText(pref.get("Class3","Enter class"));
        Textbox4.setText(pref.get("Class4","Enter class"));
        Textbox5.setText(pref.get("Class5","Enter class"));
        
        
        creditField.setText(pref.get("Credit","0"));
        creditField1.setText(pref.get("Credit1","0"));
        creditField2.setText(pref.get("Credit2","0"));
        creditField3.setText(pref.get("Credit3","0"));
        creditField4.setText(pref.get("Credit4","0"));
        creditField5.setText(pref.get("Credit5","0"));
        
        cumGPA.setText(pref.get("cumGPA","0"));
        totCredits.setText(pref.get("totCredit","0"));
        

         if (!Textbox.getText().equalsIgnoreCase("Enter class")){
            Textbox.setForeground(Color.BLACK);
            creditField.setForeground(Color.BLACK);
        }
         if (!Textbox1.getText().equalsIgnoreCase("Enter class")){
            Textbox1.setForeground(Color.BLACK);
            creditField1.setForeground(Color.BLACK);

        }
         if (!Textbox2.getText().equalsIgnoreCase("Enter class")){
            Textbox2.setForeground(Color.BLACK);
            creditField2.setForeground(Color.BLACK);

        }
         if (!Textbox3.getText().equalsIgnoreCase("Enter class")){
            Textbox3.setForeground(Color.BLACK);
            creditField3.setForeground(Color.BLACK);
        }
         if (!Textbox4.getText().equalsIgnoreCase("Enter class")){
            Textbox4.setForeground(Color.BLACK);
            creditField4.setForeground(Color.BLACK);
        }
         if (!Textbox5.getText().equalsIgnoreCase("Enter class")){
            Textbox5.setForeground(Color.BLACK);
            creditField5.setForeground(Color.BLACK);

        }
         



    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Dante;
    private javax.swing.JButton Done;
    private javax.swing.JLabel Label;
    public javax.swing.JTextField Textbox;
    public javax.swing.JTextField Textbox1;
    public javax.swing.JTextField Textbox2;
    public javax.swing.JTextField Textbox3;
    public javax.swing.JTextField Textbox4;
    public javax.swing.JTextField Textbox5;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField creditField;
    private javax.swing.JTextField creditField1;
    private javax.swing.JTextField creditField2;
    private javax.swing.JTextField creditField3;
    private javax.swing.JTextField creditField4;
    private javax.swing.JTextField creditField5;
    private javax.swing.JTextField cumGPA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField totCredits;
    // End of variables declaration//GEN-END:variables
}
