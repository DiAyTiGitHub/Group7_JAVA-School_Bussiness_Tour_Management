/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group7_java.school_bussiness_tour_management.views;

import group7_java.school_bussiness_tour_management.common.MessageDialog;
import group7_java.school_bussiness_tour_management.dao.TeacherDAO;
import group7_java.school_bussiness_tour_management.models.Company;
import group7_java.school_bussiness_tour_management.models.Teacher;
import group7_java.school_bussiness_tour_management.models.Tour;
import group7_java.school_bussiness_tour_management.services.CompanyService;
import group7_java.school_bussiness_tour_management.services.TeacherService;
import group7_java.school_bussiness_tour_management.services.TourService;
import static group7_java.school_bussiness_tour_management.services.TourService.getLastTourId;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gialo
 */
public class ManageTour extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudent
     */
    private int teacherId = -200;

    public ManageTour() {
        initComponents();
        setLocationRelativeTo(null);
        loadComboBox();
        initializeTable();
    }

    public ManageTour(int index) {
        initComponents();
        this.teacherId = index;
        setLocationRelativeTo(null);
        loadComboBox();
        initializeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tourTable = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        codeInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        descriptionInput = new javax.swing.JTextField();
        startDateInput = new javax.swing.JTextField();
        companyInput = new javax.swing.JComboBox<>();
        presentatorInput = new javax.swing.JTextField();
        teacherInput = new javax.swing.JComboBox<>();
        availablesInput = new javax.swing.JTextField();
        viewStudentListButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý chuyến tham quan");

        btn_back.setText("Trở lại trang chủ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lí thông tin chuyến tham quan doanh nghiệp");

        tourTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tourTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tourTable);

        btn_add.setText("Thêm");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_edit.setText("Sửa");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setText("Xóa");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setText("Nhập lại");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel9.setText("Mã chuyến tham quan:");

        jLabel10.setText("Tên chuyến tham quan:");

        jLabel11.setText("Mô tả hoạt động chuyến đi:");

        jLabel12.setText("Ngày diễn ra: ");

        jLabel13.setText("Doanh nghiệp chủ quản:");

        jLabel14.setText("Người đại đại doanh nghiệp:");

        jLabel15.setText("Giảng viên đại diện trường:");

        jLabel16.setText("Số lượng sinh viên có thể đi:");

        companyInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyInputActionPerformed(evt);
            }
        });

        viewStudentListButton.setText("Danh sách sinh viên tham gia");
        viewStudentListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codeInput)
                                    .addComponent(nameInput)
                                    .addComponent(descriptionInput)
                                    .addComponent(startDateInput)
                                    .addComponent(companyInput, 0, 180, Short.MAX_VALUE)
                                    .addComponent(presentatorInput)
                                    .addComponent(teacherInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(availablesInput)))
                            .addComponent(viewStudentListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(companyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(presentatorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availablesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(viewStudentListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jLabel14.getAccessibleContext().setAccessibleName("Người đại diện doanh nghiệp:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearAllFields();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        if (teacherId < 0) {
            dispose();
            Home homeScreen = new Home();
            homeScreen.setLocationRelativeTo(null);
            homeScreen.setVisible(true);
        } else {
            dispose();
            ManageTeacher teacherScreen = new ManageTeacher();
            teacherScreen.setLocationRelativeTo(null);
            teacherScreen.setVisible(true);

        }

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try {
            String tourName = this.nameInput.getText().trim();
            String tourCode = this.codeInput.getText().trim();
            String tourDes = this.descriptionInput.getText().trim();
            String tourDate = this.startDateInput.getText().trim();
            String presentator = this.presentatorInput.getText().trim();
            int availables = Integer.parseInt(this.availablesInput.getText().trim());
            Company comp = (Company) companyInput.getSelectedItem();
            Teacher tea = (Teacher) teacherInput.getSelectedItem();
            int compId = comp.getId();
            int teaId = tea.getId();
            if (tourName.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Tên chuyến đi không được để trống", "Thông báo");
                return;
            }
            if (tourCode.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Mã chuyến đi không được để trống", "Thông báo");
                return;
            }
            if (tourDate.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Ngày khởi hành của chuyến đi không được để trống", "Thông báo");
                return;
            }
            if (presentator.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Tên người đại diện không được để trống", "Thông báo");
                return;
            }
            if (availables < 10) {
                MessageDialog.showInfoDialog(this, "Số slot không hợp lệ", "Thông báo");
                return;
            }
            if (TourService.isExistedTourCode(tourCode)) {
                MessageDialog.showInfoDialog(this, "Trùng mã chuyến đi", "Thông báo");
            } else {
                if (!(teacherId < 0)) {
                    Teacher selectedTea = TeacherService.getTeacherById(teacherId);
                    List<Tour> teacher_data_tours = selectedTea.getTours();
                    int lastId = getLastTourId();
                    int id = lastId++;
                    boolean isCheck = false;
                    if (teacher_data_tours != null) {
                        for (Tour item : teacher_data_tours) {
                            if (item.getId() == id) {
                                MessageDialog.showInfoDialog(this, "Bạn đã đăng ký tham gia chuyến tham quan này", "Thông báo");
                                isCheck = true;
                                break;
                            }
                            if (item.getStartDate().compareTo(tourDate) == 0) {
                                MessageDialog.showInfoDialog(this, "Trùng thời gian, nên không thể đăng ký", "Thông báo");
                                isCheck = true;
                                break;
                            }
                        }
                        if (!isCheck) {
                            TourService.createNewTour(tourCode, tourName, tourDes, tourDate, availables, compId, teaId, presentator);
                            loadTableData();
                            MessageDialog.showInfoDialog(this, "Thêm thành công", "Thông báo");
                            clearAllFields();
                            ManageToursOfTeacher manageToursOfTeacherScreen = new ManageToursOfTeacher(selectedTea);
                            if (manageToursOfTeacherScreen != null) {
                                manageToursOfTeacherScreen.setLocationRelativeTo(null);
                                manageToursOfTeacherScreen.setVisible(true);
                                manageToursOfTeacherScreen.setImagePath(selectedTea.getImagePath());
                                manageToursOfTeacherScreen.getTeacherIdLabel().setText("Mã doanh nghiệp: " + selectedTea.getCode());
                                manageToursOfTeacherScreen.getTeacherNameLabel().setText("Tên giáo viên: " + selectedTea.getLastName() + " " + selectedTea.getFirstName());
                                manageToursOfTeacherScreen.getTeacherPhoneNumberLabel().setText("Số điện thoại: " + selectedTea.getPhoneNumber());
                                manageToursOfTeacherScreen.getTeacherEmailLable().setText("Email: " + selectedTea.getEmail());
                                manageToursOfTeacherScreen.getTeacherAdressLable().setText("Địa chỉ: " + selectedTea.getAddress());
                                manageToursOfTeacherScreen.setTeacherID(selectedTea.getId());
                                manageToursOfTeacherScreen.initializeTable();
                                dispose();
                            }
                        }
                    }
                } else {
                    TourService.createNewTour(tourCode, tourName, tourDes, tourDate, availables, compId, teaId, presentator);
                    loadTableData();
                    MessageDialog.showInfoDialog(this, "Thêm thành công", "Thông báo");
                    clearAllFields();
                }

            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Có lỗi xảy ra khi thêm mới, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            int index = tourTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn chuyến tham quan doanh nghiệp", "Thông báo");
                return;
            }
            Tour selectedTour = TourService.getTourByIndex(index);
            String tourName = this.nameInput.getText().trim();
            String tourCode = this.codeInput.getText().trim();
            String tourDes = this.descriptionInput.getText().trim();
            String tourDate = this.startDateInput.getText().trim();
            String presentator = this.presentatorInput.getText().trim();
            int availables = Integer.parseInt(this.availablesInput.getText().trim());
            Company comp = (Company) companyInput.getSelectedItem();
            Teacher tea = (Teacher) teacherInput.getSelectedItem();
            int compId = comp.getId();
            int teaId = tea.getId();
            if (tourName.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Tên chuyến đi không được để trống", "Thông báo");
                return;
            }
            if (tourCode.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Mã chuyến đi không được để trống", "Thông báo");
                return;
            }
            if (tourDate.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Ngày khởi hành của chuyến đi không được để trống", "Thông báo");
                return;
            }
            if (presentator.equalsIgnoreCase("")) {
                MessageDialog.showInfoDialog(this, "Tên người đại diện không được để trống", "Thông báo");
                return;
            }
            if (availables < 10) {
                MessageDialog.showInfoDialog(this, "Số slot không hợp lệ", "Thông báo");
                return;
            }

            selectedTour.setCode(tourCode);
            selectedTour.setName(tourName);
            selectedTour.setDescription(tourDes);
            selectedTour.setStartDate(tourDate);
            selectedTour.setAvailables(availables);
            selectedTour.setPresentator(presentator);
            selectedTour.setTeacherId(teaId);
            selectedTour.setCompanyId(compId);
            if (!(teacherId < 0)) {
                Teacher selectedTea = TeacherService.getTeacherById(teacherId);
                List<Tour> teacher_data_tours = selectedTea.getTours();
                boolean isCheck = false;
                if (teacher_data_tours != null) {
                    for (Tour item : teacher_data_tours) {
                        if (item.getId() == selectedTour.getId()) {
                            MessageDialog.showInfoDialog(this, "Bạn đã đăng ký tham gia chuyến tham quan này", "Thông báo");
                            isCheck = true;
                            break;
                        }
                        if (item.getStartDate().compareTo(tourDate) == 0) {
                            MessageDialog.showInfoDialog(this, "Trùng thời gian, nên không thể đăng ký", "Thông báo");
                            isCheck = true;
                            break;
                        }
                    }
                    if (!isCheck) {
                        TourService.updateTour(selectedTour);
                        MessageDialog.showInfoDialog(this, "Cập nhật thông tin thành công!", "Thông báo");
                        clearAllFields();
                        loadTableData();
                        ManageToursOfTeacher manageToursOfTeacherScreen = new ManageToursOfTeacher(selectedTea);
                        if (manageToursOfTeacherScreen != null) {
                            manageToursOfTeacherScreen.setLocationRelativeTo(null);
                            manageToursOfTeacherScreen.setVisible(true);
                            manageToursOfTeacherScreen.setImagePath(selectedTea.getImagePath());
                            manageToursOfTeacherScreen.getTeacherIdLabel().setText("Mã doanh nghiệp: " + selectedTea.getCode());
                            manageToursOfTeacherScreen.getTeacherNameLabel().setText("Tên giáo viên: " + selectedTea.getLastName() + " " + selectedTea.getFirstName());
                            manageToursOfTeacherScreen.getTeacherPhoneNumberLabel().setText("Số điện thoại: " + selectedTea.getPhoneNumber());
                            manageToursOfTeacherScreen.getTeacherEmailLable().setText("Email: " + selectedTea.getEmail());
                            manageToursOfTeacherScreen.getTeacherAdressLable().setText("Địa chỉ: " + selectedTea.getAddress());
                            manageToursOfTeacherScreen.setTeacherID(selectedTea.getId());
                            manageToursOfTeacherScreen.initializeTable();
                            dispose();
                        }
                    }
                }
            } else {
                TourService.updateTour(selectedTour);
                MessageDialog.showInfoDialog(this, "Cập nhật thông tin thành công!", "Thông báo");
                clearAllFields();
                loadTableData();
            }

        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Xảy ra lỗi khi sửa thông tin doanh nghiệp, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Phát hiện lỗi");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tourTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourTableMouseClicked
        try {
            int index = tourTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn chuyến tham quan doanh nghiệp", "Thông báo");
                return;
            }
            Tour selectedTour = TourService.getTourByIndex(index);
            codeInput.setText(selectedTour.getCode());
            nameInput.setText(selectedTour.getName());
            descriptionInput.setText(selectedTour.getDescription());
            startDateInput.setText(selectedTour.getStartDate());
            presentatorInput.setText(selectedTour.getPresentator());
            availablesInput.setText(String.valueOf(selectedTour.getAvailables()));
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Có lỗi, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Phát hiện lỗi");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tourTableMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            int index = tourTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn chuyến tham quan doanh nghiệp", "Thông báo");
                return;
            }
            Tour selectedTour = TourService.getTourByIndex(index);
            int keyPress = MessageDialog.showConfirmDialog(this, "Bạn có chắc muốn xóa chuyến này ", "Xác nhận");
            if (keyPress == 0) {
                TourService.deleteTour(selectedTour.getId());
                loadTableData();
                clearAllFields();
            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Xảy ra lỗi khi xóa, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Phát hiện lỗi");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void companyInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyInputActionPerformed

    private void viewStudentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentListButtonActionPerformed
        try {
            int index = tourTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn chuyến tham quan doanh nghiệp trước để xem danh sách sinh viên tham gia", "Thông báo");
                return;
            }
            Tour selectedTour = TourService.getTourByIndex(index);
            ManageTourStudent screen = new ManageTourStudent(selectedTour);
            screen.setLocationRelativeTo(null);
            screen.setVisible(true);
            dispose();
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Xảy ra lỗi khi xóa, chi tiết: " + ex.getMessage() + "\n" + ex.toString() + "\n", "Phát hiện lỗi");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_viewStudentListButtonActionPerformed

    private void clearAllFields() {
        codeInput.setText("");
        nameInput.setText("");
        descriptionInput.setText("");
        startDateInput.setText("");
        presentatorInput.setText("");
        availablesInput.setText("");
    }

    private DefaultTableModel tableModel;

    private void loadComboBox() {
        try {
            if (teacherId < 0) {
                List<Company> company_data = CompanyService.getAllCompanies();
                for (Company comp : company_data) {
                    companyInput.addItem(comp);
                }
                List<Teacher> teacher_data = TeacherService.getAllTeachers();
                for (Teacher teacher : teacher_data) {
                    teacherInput.addItem(teacher);
                }
            } else {
                List<Company> company_data = CompanyService.getAllCompanies();
                for (Company comp : company_data) {
                    companyInput.addItem(comp);
                }
                List<Teacher> teacher_data = TeacherService.getAllTeachers();
                for (Teacher teacher : teacher_data) {
                    if (teacher.getId() == teacherId) {
                        teacherInput.addItem(teacher);
                    }
                }
            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Tải dữ liệu cho combobox có lỗi! Chi tiết: " + ex.getMessage(), "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }

    private void loadTableData() {
        try {
            List<Tour> tour_data = TourService.getAllTours();
            List<Company> company_data = CompanyService.getAllCompanies();
            List<Teacher> teacher_data = TeacherService.getAllTeachers();
            tableModel.setRowCount(0);
            if (tour_data != null) {
                for (Tour tour : tour_data) {
                    String companyName = "";
                    String teacherName = "";
                    for (Company comp : company_data) {
                        if (comp.getId() == tour.getCompanyId()) {
                            companyName = comp.getName();
                        }
                    }
                    for (Teacher tea : teacher_data) {
                        if (tea.getId() == tour.getTeacherId()) {
                            teacherName = tea.getLastName() + " " + tea.getFirstName();
                        }
                    }
                    tableModel.addRow(new Object[]{tour.getCode(), tour.getName(),
                        tour.getStartDate(), tour.getDescription(),
                        tour.getAvailables(),
                        tour.getPresentator(), companyName, teacherName});
                }
            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Tải dữ liệu cho bảng có lỗi! Chi tiết: " + ex.getMessage(), "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }

    private void initializeTable() {
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Mã chuyến", "Tên chuyến", "Thời gian", "Mô tả",
            "Số lượng", "Người đại diện", "Công ty", "Giáo viên"});
        tourTable.setModel(tableModel);
        if (teacherId >= 0) {
            btn_delete.setEnabled(false);
            btn_back.setText("Quay lại trang trước");
        }
        loadTableData();
    }

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
            java.util.logging.Logger.getLogger(ManageTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageTour().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availablesInput;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JTextField codeInput;
    private javax.swing.JComboBox<Object> companyInput;
    private javax.swing.JTextField descriptionInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField presentatorInput;
    private javax.swing.JTextField startDateInput;
    private javax.swing.JComboBox<Object> teacherInput;
    private javax.swing.JTable tourTable;
    private javax.swing.JButton viewStudentListButton;
    // End of variables declaration//GEN-END:variables
}
