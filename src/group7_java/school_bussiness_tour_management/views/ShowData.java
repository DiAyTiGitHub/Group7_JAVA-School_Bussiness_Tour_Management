/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group7_java.school_bussiness_tour_management.views;

import group7_java.school_bussiness_tour_management.common.MessageDialog;
import group7_java.school_bussiness_tour_management.common.PDFExporter;
import group7_java.school_bussiness_tour_management.common.TransmittedDataShowData;
import group7_java.school_bussiness_tour_management.models.Company;
import group7_java.school_bussiness_tour_management.models.Student;
import group7_java.school_bussiness_tour_management.models.StudentTour;
import group7_java.school_bussiness_tour_management.models.Teacher;
import group7_java.school_bussiness_tour_management.models.Tour;
import group7_java.school_bussiness_tour_management.services.CompanyService;
import group7_java.school_bussiness_tour_management.services.StudentService;
import group7_java.school_bussiness_tour_management.services.TeacherService;
import group7_java.school_bussiness_tour_management.services.TourService;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN TRANG
 */
public class ShowData extends javax.swing.JFrame {

    /**
     * Creates new form ShowData
     */
    TransmittedDataShowData dataOfShowData;

    public ShowData(TransmittedDataShowData data) {
        try {
            this.dataOfShowData = data;
            initComponents();
            setLocationRelativeTo(null);
            checkAndInitializeTable();
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Có lỗi xảy ra! Chi tiết: " + ex.getMessage(), "lỗi");
            ex.printStackTrace();
        }
    }

    private ShowData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void checkAndInitializeTable() {
        try {
            if (dataOfShowData.getTypeData() != null && dataOfShowData.getBackToPage() != null) {
                tableModel = new DefaultTableModel();
                if (dataOfShowData.getTypeData().equalsIgnoreCase("teachers")) {
                    titleMainLabel.setText("Danh sách giáo viên đại diện doanh nghiệp");
                    tableModel.setColumnIdentifiers(new String[]{"Mã giáo viên", "Họ tên",
                        "Địa chỉ", "Điện thoại", "Email", "Ngày sinh"});
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("students")) {
                    titleMainLabel.setText("Danh sách sinh viên được quản lý");
                    tableModel.setColumnIdentifiers(new String[]{"Mã sinh viên", "Họ", "Tên", "Địa chỉ", "SĐT", "Email", "Ngày sinh", "Class id"});
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("companys")) {
                    titleMainLabel.setText("Danh sách doanh nghiệp liên kết với nhà trường");
                    tableModel.setColumnIdentifiers(new String[]{"Mã doanh nghiệp", "Doanh nghiệp", "Địa chỉ",
                        "Email", "Điện thoại", "Mô tả"});
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("tours")) {
                    titleMainLabel.setText("Danh sách các chuyến tham quan được tổ chức");
                    tableModel.setColumnIdentifiers(new String[]{"Mã chuyến", "Tên chuyến", "Thời gian", "Mô tả",
                        "Số lượng", "Người đại diện", "Công ty", "Giáo viên"});
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("studentTours")) {
                    titleMainLabel.setText("Danh sách sinh viên của chuyến tham quan");
                    tableModel.setColumnIdentifiers(new String[]{"Mã sinh viên", "Họ", "Tên", "Địa chỉ", "SĐT", "Email", "Ngày sinh", "Class id"});
                }
                dataTable.setModel(tableModel);
                loadTableData();
            }
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(search, "Có lỗi, chi tiết: " + ex.getMessage(), "Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleMainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        clearDataButton = new javax.swing.JToggleButton();
        search = new javax.swing.JLabel();
        backButton = new javax.swing.JToggleButton();
        searchInput = new javax.swing.JTextField();
        searchButton = new javax.swing.JToggleButton();
        exportExcelFileButton = new javax.swing.JToggleButton();
        exportPDFFileButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xem dữ liệu");

        titleMainLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleMainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMainLabel.setText("Danh sách sinh viên được quản lí");
        titleMainLabel.setToolTipText("");

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dataTable);

        clearDataButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearDataButton.setText("Nhập lại");
        clearDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDataButtonActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.setText("Tìm kiếm theo tên: ");

        backButton.setBackground(new java.awt.Color(0, 102, 0));
        backButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Quay lại trang trước");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchInputKeyReleased(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        exportExcelFileButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exportExcelFileButton.setText("Xuất danh sách EXCEL");
        exportExcelFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportExcelFileButtonActionPerformed(evt);
            }
        });

        exportPDFFileButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exportPDFFileButton.setText("Xuất danh sách PDF");
        exportPDFFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDFFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMainLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search)
                            .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exportExcelFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exportPDFFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exportPDFFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exportExcelFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDataButtonActionPerformed
        searchInput.setText("");
    }//GEN-LAST:event_clearDataButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        if (dataOfShowData.getBackToPage().equalsIgnoreCase("managetoursofteacher")) {

            try {
                Teacher selectedTea = TeacherService.getTeacherById(dataOfShowData.getTeacherId());
                ManageToursOfTeacher manageToursOfTeacherScreen = new ManageToursOfTeacher();
                if (manageToursOfTeacherScreen != null) {
                    manageToursOfTeacherScreen.setLocationRelativeTo(null);
                    manageToursOfTeacherScreen.setVisible(true);
                    manageToursOfTeacherScreen.getTeacherIdLabel().setText("Mã doanh nghiệp: " + selectedTea.getCode());
                    manageToursOfTeacherScreen.getTeacherNameLabel().setText("Tên giáo viên: " + selectedTea.getLastName() + " " + selectedTea.getFirstName());
                    manageToursOfTeacherScreen.getTeacherPhoneNumberLabel().setText("Số điện thoại: " + selectedTea.getPhoneNumber());
                    manageToursOfTeacherScreen.getTeacherEmailLable().setText("Email: " + selectedTea.getEmail());
                    manageToursOfTeacherScreen.getTeacherAdressLable().setText("Địa chỉ: " + selectedTea.getAddress());
                    manageToursOfTeacherScreen.setTeacherID(selectedTea.getId());
                    manageToursOfTeacherScreen.initializeTable();
                    dispose();
                }
            } catch (Exception ex) {
                MessageDialog.showErrorDialog(this, "Có lỗi, chi tiết: " + ex.getMessage(), "Lỗi");
            }

        } else if (dataOfShowData.getBackToPage().equalsIgnoreCase("home")) {
            Home home = new Home();
            home.setLocationRelativeTo(null);
            home.setVisible(true);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchByKey();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void exportExcelFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportExcelFileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportExcelFileButtonActionPerformed

    private void exportPDFFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDFFileButtonActionPerformed
        try {
            String title = "";
            if (dataOfShowData.getTypeData() != null) {
                if (dataOfShowData.getTypeData().equalsIgnoreCase("teachers")) {
                    title = "DANH SÁCH GIÁO VIÊN ĐẠI DIỆN DOANH NGHIỆP";
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("students")) {
                    title = "DANH SÁCH SINH VIÊN ĐƯỢC QUẢN LÝ";
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("companys")) {
                    title = "DANH SÁCH DOANH NGHIỆP LIÊN KẾT VỚI NHÀ TRƯỜNG";
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("tours")) {
                    title = "DANH SÁCH CÁC CHUYẾN THAM QUAN ĐƯỢC TỔ CHỨC";
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("studentTours")) {
                    title = "DANH SÁCH SINH VIÊN CỦA CHUYẾN THAM QUAN";
                }
                dataTable.setModel(tableModel);
                loadTableData();
            }
            PDFExporter.exportTableToPDF(dataTable, title);
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(search, "Có lỗi ở phần xuất PDF, chi tiết: " + ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_exportPDFFileButtonActionPerformed

    private void searchInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Handle Enter key press
            searchByKey();
        }
    }//GEN-LAST:event_searchInputKeyReleased

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
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ShowData().setVisible(true);
        });
    }

    private DefaultTableModel tableModel;

    private void loadTableData() {
        try {
            if (dataOfShowData.getTypeData() != null && dataOfShowData.getBackToPage() != null) {
                clearTable();

                if (dataOfShowData.getTypeData().equalsIgnoreCase("teachers")) {
                    loadTeachersData();
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("companys")) {
                    loadCompaniesData();
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("students")) {
                    loadStudentsData();
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("tours")) {
                    loadToursData();
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("studentTours")) {
                    loadStudentToursData();
                }

                tableModel.fireTableDataChanged();
            }
        } catch (Exception e) {
            handleLoadTableDataException(e);
        }
    }

    private void clearTable() {
        tableModel.setRowCount(0);
    }

    private void loadTeachersData() throws Exception {
        List<Teacher> data = TeacherService.getAllTeachers();
        if (data != null) {
            for (Teacher tea : data) {
                tableModel.addRow(new Object[]{tea.getCode(), tea.getLastName() + " " + tea.getFirstName(), tea.getAddress(), tea.getPhoneNumber(), tea.getEmail(), tea.getBirthDate()});
            }
        }
    }

    private void loadCompaniesData() throws Exception {
        List<Company> data = CompanyService.getAllCompanies();
        if (data != null) {
            for (Company com : data) {
                tableModel.addRow(new Object[]{com.getCode(), com.getName(), com.getAddress(), com.getEmail(), com.getPhoneNumber(), com.getDescription()});
            }
        }
    }

    private void loadStudentsData() throws Exception {
        List<Student> data = StudentService.getAllStudents();
        if (data != null) {
            for (Student stu : data) {
                tableModel.addRow(new Object[]{stu.getCode(), stu.getLastName(), stu.getFirstName(), stu.getAddress(), stu.getPhoneNumber(), stu.getEmail(), stu.getBirthDate(), stu.getClassId()});
            }
        }
    }

    private void loadToursData() throws Exception {
        List<Tour> tourData = TourService.getAllTours();
        List<Company> companyData = CompanyService.getAllCompanies();
        List<Teacher> teacherData = TeacherService.getAllTeachers();

        if (tourData != null) {
            for (Tour tour : tourData) {
                String companyName = getCompanyName(tour.getCompanyId(), companyData);
                String teacherName = getTeacherName(tour.getTeacherId(), teacherData);

                tableModel.addRow(new Object[]{tour.getCode(), tour.getName(), tour.getStartDate(), tour.getDescription(), tour.getAvailables(), tour.getPresentator(), companyName, teacherName});
            }
        }
    }

    private String getCompanyName(int companyId, List<Company> companyData) {
        for (Company comp : companyData) {
            if (comp.getId() == companyId) {
                return comp.getName();
            }
        }
        return "";
    }

    private String getTeacherName(int teacherId, List<Teacher> teacherData) {
        for (Teacher tea : teacherData) {
            if (tea.getId() == teacherId) {
                return tea.getLastName() + " " + tea.getFirstName();
            }
        }
        return "";
    }

    private void loadStudentToursData() throws Exception {
        Tour tour = TourService.getTourById(dataOfShowData.getTourId());
        List<StudentTour> data = tour.getStudentTours();
        List<Student> students = StudentService.getAllStudents();

        if (data != null && students != null && data.size() > 0) {
            for (Student stu : students) {
                if (containsStudentTourWithId(data, stu.getId())) {
                    tableModel.addRow(new Object[]{stu.getCode(), stu.getLastName(), stu.getFirstName(), stu.getAddress(), stu.getPhoneNumber(), stu.getEmail(), stu.getBirthDate(), stu.getClassId()});
                }
            }
        }
    }

    private void handleLoadTableDataException(Exception e) {
        MessageDialog.showErrorDialog(this, "Tải dữ liệu cho bảng có lỗi! Chi tiết: " + e.getMessage(), "Có lỗi xảy ra");
        e.printStackTrace();
    }

    private boolean containsStudentTourWithId(List<StudentTour> data, int studentId) {
        for (StudentTour studentTour : data) {
            if (studentTour.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }

    private void searchByKey() {
        try {
            String keyword = searchInput.getText().trim();
            int count = 0;
            if (keyword.trim().equals("")) {
                checkAndInitializeTable();
                MessageDialog.showInfoDialog(this, "Chưa có từ khóa tìm kiếm", "Thông báo");
                return;
            }
            if (dataOfShowData.getTypeData() != null) {
                if (dataOfShowData.getTypeData().equalsIgnoreCase("teachers")) {
                    List<Teacher> data = TeacherService.getAllTeachers();
                    tableModel.setRowCount(0);
                    if (data != null) {
                        for (Teacher tea : data) {
                            if (tea.getFirstName().equalsIgnoreCase(keyword) || tea.getLastName().equalsIgnoreCase(keyword) || keyword.equalsIgnoreCase(tea.getLastName() + tea.getFirstName())) {
                                tableModel.addRow(new Object[]{tea.getCode(), tea.getLastName() + " " + tea.getFirstName(), tea.getAddress(), tea.getPhoneNumber(), tea.getEmail(), tea.getBirthDate()
                                });
                            } else {
                                count++;
                            }
                        }
                        if (count == data.size()) {
                            MessageDialog.showInfoDialog(search, "Không tìm thấy giáo viên bạn cần tìm", "Thông báo");
                            checkAndInitializeTable();
                        }
                    }
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("companys")) {
                    List<Company> data = CompanyService.getAllCompanies();
                    tableModel.setRowCount(0);
                    if (data != null) {
                        for (Company com : data) {
                            if (com.getName().equalsIgnoreCase(keyword)) {
                                tableModel.addRow(new Object[]{com.getCode(), com.getName(), com.getAddress(),
                                    com.getEmail(), com.getPhoneNumber(),
                                    com.getDescription()});
                            } else {
                                count++;
                            }
                        }
                        if (count == data.size()) {
                            MessageDialog.showInfoDialog(search, "Không tìm thấy doanh nghiệp bạn cần tìm", "Thông báo");
                            checkAndInitializeTable();
                        }
                    }
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("tours")) {
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
                            if (keyword.equalsIgnoreCase(teacherName) || keyword.equalsIgnoreCase(companyName) || keyword.equalsIgnoreCase(tour.getName())) {
                                tableModel.addRow(new Object[]{tour.getCode(), tour.getName(),
                                    tour.getStartDate(), tour.getDescription(),
                                    tour.getAvailables(),
                                    tour.getPresentator(), companyName, teacherName});
                            } else {
                                count++;
                            }
                        }
                        if (count == tour_data.size()) {
                            MessageDialog.showInfoDialog(search, "Không tìm thấy chuyến tham quan doanh nghiệp bạn cần tìm", "Thông báo");
                            checkAndInitializeTable();
                        }
                    }
                } else if (dataOfShowData.getTypeData().equalsIgnoreCase("students") || dataOfShowData.getTypeData().equalsIgnoreCase("studentTours")) {
                    List<Student> data = StudentService.getAllStudents();
                    tableModel.setRowCount(0);
                    if (data != null) {
                        for (Student stu : data) {
                            if (stu.getFirstName().equalsIgnoreCase(keyword) || stu.getLastName().equalsIgnoreCase(keyword) || keyword.equalsIgnoreCase(stu.getLastName() + stu.getFirstName())) {
                                tableModel.addRow(new Object[]{stu.getCode(), stu.getLastName(), stu.getFirstName(), stu.getAddress(), stu.getPhoneNumber(), stu.getEmail(), stu.getBirthDate(), stu.getClassId()
                                });
                            } else {
                                count++;
                            }
                        }
                        if (count == data.size()) {
                            MessageDialog.showInfoDialog(search, "Không tìm thấy sinh viên bạn cần tìm", "Thông báo");
                            checkAndInitializeTable();
                        }
                    }

                }
            }
            tableModel.fireTableDataChanged();
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Tải dữ liệu cho bảng có lỗi! Chi tiết: " + ex.getMessage(), "Có lỗi xảy ra");
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton backButton;
    private javax.swing.JToggleButton clearDataButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JToggleButton exportExcelFileButton;
    private javax.swing.JToggleButton exportPDFFileButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel search;
    private javax.swing.JToggleButton searchButton;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel titleMainLabel;
    // End of variables declaration//GEN-END:variables
}
