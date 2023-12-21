/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group7_java.school_bussiness_tour_management.views;

import group7_java.school_bussiness_tour_management.common.MessageDialog;
import static group7_java.school_bussiness_tour_management.common.Validator.isDate;
import static group7_java.school_bussiness_tour_management.common.Validator.isNumeric;
import static group7_java.school_bussiness_tour_management.common.Validator.isValidEmail;
import group7_java.school_bussiness_tour_management.dao.AccountDAO;
import group7_java.school_bussiness_tour_management.models.Account;
import group7_java.school_bussiness_tour_management.models.Teacher;
import group7_java.school_bussiness_tour_management.services.TeacherService;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author NGUYEN TRANG
 */
public class TeacherProfile extends javax.swing.JFrame {

    /**
     * Creates new form TeacherProfile
     */
    private String selectedImagePath = "";
    private static final String imageFolderPath = "src/group7_java/school_bussiness_tour_management/resources/";
    private Teacher selectTeacher;

    private TeacherProfile() {
        initComponents();
    }

    public TeacherProfile(Teacher teacher) {
        try {
            this.selectTeacher = teacher;
            initComponents();
            loadInformationTeacher();
        } catch (Exception ex) {
            Logger.getLogger(TeacherProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadInformationTeacher() throws Exception {
        if (selectTeacher != null) {
            teacherNameTitle.setText(selectTeacher.getLastName().toUpperCase() + " " + selectTeacher.getFirstName().toUpperCase());
            teacherCodeInput.setText(selectTeacher.getCode());
            teacherNameInput.setText(selectTeacher.getLastName() + " " + selectTeacher.getFirstName());
            teacherBirthdayInput.setText(selectTeacher.getBirthDate());
            teacherPhoneNumBerInput.setText(selectTeacher.getPhoneNumber());
            teacherAddressInput.setText(selectTeacher.getAddress());
            teacherEmailInput.setText(selectTeacher.getEmail());
            ImageIcon imageIcon = new ImageIcon(selectTeacher.getImagePath());
            // Chỉnh kích thước ảnh vừa với khung 
            Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            imageLabel.setIcon(imageIcon);
            teacherAvatar.setIcon(imageIcon);
            List<Account> data_accounts = AccountDAO.readFromFile();
            Account selectAccount = null;
            for (Account item : data_accounts) {
                if (item.getId() == selectTeacher.getAccountId()) {
                    selectAccount = item;
                    break;
                }
            }
            teacherUsernameInput.setText(selectAccount.getUsername());
            teacherPasswordInput.setText(selectAccount.getPassword());
            disableInput();
        }
    }

    private void disableInput() {
        teacherAvataButton.setEnabled(false);
        teacherCodeInput.setEnabled(false);
        teacherNameInput.setEnabled(false);
        teacherBirthdayInput.setEnabled(false);
        teacherPhoneNumBerInput.setEnabled(false);
        teacherAddressInput.setEnabled(false);
        teacherEmailInput.setEnabled(false);
        teacherUsernameInput.setEnabled(false);
        teacherPasswordInput.setEnabled(false);
        teacherCodeInput.setDisabledTextColor(Color.BLACK);
        teacherNameInput.setDisabledTextColor(Color.BLACK);
        teacherBirthdayInput.setDisabledTextColor(Color.BLACK);
        teacherPhoneNumBerInput.setDisabledTextColor(Color.BLACK);
        teacherAddressInput.setDisabledTextColor(Color.BLACK);
        teacherEmailInput.setDisabledTextColor(Color.BLACK);
        teacherUsernameInput.setDisabledTextColor(Color.BLACK);
        teacherPasswordInput.setDisabledTextColor(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        teacherNameTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        backpage = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        teacherCodeLabel = new javax.swing.JLabel();
        teacherCodeInput = new javax.swing.JTextField();
        teacherNameLabel = new javax.swing.JLabel();
        teacherNameInput = new javax.swing.JTextField();
        teacherAddressLabel = new javax.swing.JLabel();
        teacherAddressInput = new javax.swing.JTextField();
        teacherEmailLabel = new javax.swing.JLabel();
        teacherEmailInput = new javax.swing.JTextField();
        teacherPhoneNumberLabel = new javax.swing.JLabel();
        teacherPhoneNumBerInput = new javax.swing.JTextField();
        teacherBirthdayLabel = new javax.swing.JLabel();
        teacherBirthdayInput = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        teacherAvataButton = new javax.swing.JButton();
        changeInformationButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        teacherAvatar = new javax.swing.JLabel();
        MainTile1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        teacherUsernameLabel = new javax.swing.JLabel();
        teacherPasswordLabel = new javax.swing.JLabel();
        teacherUsernameInput = new javax.swing.JTextField();
        teacherPasswordInput = new javax.swing.JTextField();
        changeAccoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        teacherNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        teacherNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        teacherNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacherNameTitle.setText("NGUYỄN THỊ TRANG");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Giáo viên");

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
        );

        backpage.setText("Quay lại trang trước");
        backpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backpageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(backpage)
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(teacherNameTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(backpage)
                .addGap(331, 331, 331))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));

        teacherCodeLabel.setText("Mã giáo viên: ");

        teacherCodeInput.setForeground(new java.awt.Color(0, 0, 0));

        teacherNameLabel.setText("Tên giáo viên:");

        teacherNameInput.setForeground(new java.awt.Color(0, 0, 0));

        teacherAddressLabel.setText("Địa chỉ:");

        teacherAddressInput.setForeground(new java.awt.Color(0, 0, 0));

        teacherEmailLabel.setText("Email:");

        teacherEmailInput.setForeground(new java.awt.Color(0, 0, 0));

        teacherPhoneNumberLabel.setText("Số điện thoại");

        teacherPhoneNumBerInput.setForeground(new java.awt.Color(0, 0, 0));

        teacherBirthdayLabel.setText("Ngày sinh:");

        teacherBirthdayInput.setForeground(new java.awt.Color(0, 0, 0));

        image.setText("Hình ảnh: ");

        teacherAvataButton.setText("Thay đổi hình ảnh");
        teacherAvataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAvataButtonActionPerformed(evt);
            }
        });

        changeInformationButton.setBackground(new java.awt.Color(0, 153, 0));
        changeInformationButton.setForeground(new java.awt.Color(255, 255, 255));
        changeInformationButton.setText("Thay đổi thông tin");
        changeInformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeInformationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherAvatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherAvatar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherCodeLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teacherAddressInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(teacherCodeInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherBirthdayLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherBirthdayInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(teacherAddressLabel))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(teacherEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teacherPhoneNumBerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teacherPhoneNumberLabel)
                                .addComponent(teacherNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teacherNameLabel)
                                .addComponent(teacherEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(image)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(teacherAvataButton)
                            .addGap(351, 351, 351))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeInformationButton)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherCodeLabel)
                    .addComponent(teacherNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherBirthdayLabel)
                    .addComponent(teacherPhoneNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherBirthdayInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherPhoneNumBerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherAddressLabel)
                    .addComponent(teacherEmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherAddressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 21, Short.MAX_VALUE)
                                .addComponent(teacherAvataButton)
                                .addGap(13, 13, 13)
                                .addComponent(changeInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(image)
                        .addContainerGap())))
        );

        MainTile1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MainTile1.setText("THÔNG TIN GIÁO VIÊN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("TÀI KHOẢN");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));

        teacherUsernameLabel.setText("Tên tài khoản: ");

        teacherPasswordLabel.setText("Mật khẩu:");

        changeAccoutButton.setBackground(new java.awt.Color(0, 153, 0));
        changeAccoutButton.setForeground(new java.awt.Color(255, 255, 255));
        changeAccoutButton.setText("Thay đổi thông tin");
        changeAccoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAccoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changeAccoutButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherUsernameLabel)
                            .addComponent(teacherPasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teacherUsernameInput)
                            .addComponent(teacherPasswordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherUsernameLabel)
                    .addComponent(teacherUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherPasswordLabel)
                    .addComponent(teacherPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changeAccoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainTile1)
                            .addComponent(jLabel3))
                        .addGap(0, 469, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(MainTile1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeInformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeInformationButtonActionPerformed
        boolean isCheck = false;
        teacherNameInput.setEnabled(true);
        teacherBirthdayInput.setEnabled(true);
        teacherPhoneNumBerInput.setEnabled(true);
        teacherAddressInput.setEnabled(true);
        teacherEmailInput.setEnabled(true);
        teacherAvataButton.setEnabled(true);

        String imagePath = selectTeacher.getImagePath();

        if (!selectedImagePath.equals(imagePath)) {
            if (!selectedImagePath.trim().equals("")) {
                selectTeacher.setImagePath(selectedImagePath);
            }
        }

        String teacherName = this.teacherNameInput.getText().trim();
        String teacherAddress = this.teacherAddressInput.getText().trim();
        String teacherPhoneNumber = this.teacherPhoneNumBerInput.getText().trim();
        String teacherBirthday = this.teacherBirthdayInput.getText().trim();
        String teacherEmail = this.teacherEmailInput.getText().trim();

        // Bắt lỗi, không nhập đủ

        if (teacherName.equals("")) {
            MessageDialog.showInfoDialog(jPanel1, "Bạn chưa nhập họ tên giáo viên", "Thông báo");
            return;
        }

        if (teacherAddress.equals("")) {
            MessageDialog.showInfoDialog(jPanel1, "Bạn chưa nhập địa chỉ", "Thông báo");
            return;
        }
        if (teacherPhoneNumber.equals("")) {
            MessageDialog.showInfoDialog(jPanel1, "Bạn chưa nhập số điện thoại", "Thông báo");
            return;
        }
        if (!isNumeric(teacherPhoneNumber)) {
            MessageDialog.showInfoDialog(jPanel1, "Dữ liệu nhập vào phải là số", "Thông báo");
            return;
        }
        if (teacherBirthday.equals("")) {
            MessageDialog.showInfoDialog(jPanel1, "Bạn chưa nhập ngày sinh", "Thông báo");
            return;
        }

        if (!isDate(teacherBirthday)) {
            MessageDialog.showInfoDialog(jPanel1, "Ngày sinh nhập chưa đúng định dạng", "Thông báo");
            return;
        }
        if (teacherEmail.equals("")) {
            MessageDialog.showInfoDialog(jPanel1, "Bạn chưa nhập email", "Thông báo");
            return;
        }
        if (!isValidEmail(teacherEmail)) {
            MessageDialog.showInfoDialog(jPanel1, "Email không đúng định dạng", "Thông báo");
            return;
        }

        if (teacherName.equalsIgnoreCase(selectTeacher.getLastName() + " " + selectTeacher.getFirstName())
                && teacherAddress.equalsIgnoreCase(selectTeacher.getAddress())
                && teacherPhoneNumber.equalsIgnoreCase(selectTeacher.getPhoneNumber())
                && teacherBirthday.equalsIgnoreCase(selectTeacher.getBirthDate())
                && teacherEmail.equalsIgnoreCase(selectTeacher.getEmail())
                && selectedImagePath.trim().equals("")) {
            isCheck = true;
        }

        if (isCheck) {

        } else {
            selectTeacher.setFirstName(TeacherService.FirstName(teacherName));
            selectTeacher.setLastName(TeacherService.LastName(teacherName));
            selectTeacher.setPhoneNumber(teacherPhoneNumber);
            selectTeacher.setBirthDate(teacherBirthday);
            selectTeacher.setEmail(teacherEmail);
            selectTeacher.setAddress(teacherAddress);

            try {

                TeacherService.updateTeacher(selectTeacher);
                MessageDialog.showInfoDialog(jPanel1, "Cập nhật thông tin thành công!", "Thông báo");
                loadInformationTeacher();

            } catch (Exception ex) {
                MessageDialog.showErrorDialog(jPanel1, "Có lỗi, chi tiết: " + ex.getMessage(), "Lỗi");
            }

        }


    }//GEN-LAST:event_changeInformationButtonActionPerformed

    private void changeAccoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAccoutButtonActionPerformed
        try {
            boolean isCheck = false;
            teacherPasswordInput.setEnabled(true);
            List<Account> data_accounts = AccountDAO.readFromFile();
            String password = teacherPasswordInput.getText().trim();
            if (password.equals("")) {
                MessageDialog.showInfoDialog(jPanel1, "Bạn chưa nhập mật khẩu", "Thông báo");
                return;
            }
            Account selectAccount = null;
            for (Account item : data_accounts) {
                if (item.getId() == selectTeacher.getAccountId()) {
                    selectAccount = item;
                    break;
                }
            }
            if (password.equalsIgnoreCase(selectAccount.getPassword())) {
                isCheck = true;
            }

            if (isCheck) {

            } else {
                for (Account item : data_accounts) {
                    if (item.getId() == selectTeacher.getAccountId()) {
                        item.setPassword(password);
                        break;
                    }

                }
                AccountDAO.writeToFile(data_accounts);
                MessageDialog.showInfoDialog(jPanel1, "Cập nhật thông tin thành công!", "Thông báo");
                loadInformationTeacher();
            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(jPanel1, "Có lỗi, chi tiết: " + ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_changeAccoutButtonActionPerformed

    private void teacherAvataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAvataButtonActionPerformed
        JFileChooser browseImageFile = new JFileChooser();

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpeg", "jpg", "jfif", "svg");
        browseImageFile.addChoosableFileFilter(fnef);

        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();

            // Tạo đường dẫn mới cho tập tin hình ảnh đến thư mục đích
            Path currentDirectory = Paths.get("").toAbsolutePath();
            Path destinationDirectory = currentDirectory.resolve(Paths.get("src", "group7_java", "school_bussiness_tour_management", "resources"));
            Path destinationPath = destinationDirectory.resolve(selectedImageFile.getName());

            try {
                // Sao chép tập tin vào thư mục đích
                Files.copy(selectedImageFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
                JOptionPane.showMessageDialog(null, "Tải tệp thành công");

                // Lấy đường dẫn tương đối của tập tin đã lưu
                Path relativePath = currentDirectory.relativize(destinationPath);
                selectedImagePath = relativePath.toString();

                // Hiển thị ảnh
                ImageIcon imageIcon = new ImageIcon(selectedImageFile.toURI().toURL()); // Chuyển đổi File thành URL
                Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(image);
                imageLabel.setIcon(imageIcon);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Có lỗi trong quá trình lưu tệp");
            }
        }
    }//GEN-LAST:event_teacherAvataButtonActionPerformed

    private void backpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backpageActionPerformed
        dispose();
        StudentAndTeacherHome screen = new StudentAndTeacherHome(selectTeacher);
        screen.setLocationRelativeTo(null);
        screen.setVisible(true);
    }//GEN-LAST:event_backpageActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TeacherProfile().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainTile1;
    private javax.swing.JButton backpage;
    private javax.swing.JButton changeAccoutButton;
    private javax.swing.JButton changeInformationButton;
    private javax.swing.JLabel image;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField teacherAddressInput;
    private javax.swing.JLabel teacherAddressLabel;
    private javax.swing.JButton teacherAvataButton;
    private javax.swing.JLabel teacherAvatar;
    private javax.swing.JTextField teacherBirthdayInput;
    private javax.swing.JLabel teacherBirthdayLabel;
    private javax.swing.JTextField teacherCodeInput;
    private javax.swing.JLabel teacherCodeLabel;
    private javax.swing.JTextField teacherEmailInput;
    private javax.swing.JLabel teacherEmailLabel;
    private javax.swing.JTextField teacherNameInput;
    private javax.swing.JLabel teacherNameLabel;
    private javax.swing.JLabel teacherNameTitle;
    private javax.swing.JTextField teacherPasswordInput;
    private javax.swing.JLabel teacherPasswordLabel;
    private javax.swing.JTextField teacherPhoneNumBerInput;
    private javax.swing.JLabel teacherPhoneNumberLabel;
    private javax.swing.JTextField teacherUsernameInput;
    private javax.swing.JLabel teacherUsernameLabel;
    // End of variables declaration//GEN-END:variables
}
