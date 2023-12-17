/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group7_java.school_bussiness_tour_management.views;

import group7_java.school_bussiness_tour_management.common.MessageDialog;
import group7_java.school_bussiness_tour_management.common.PDFExporter;
import group7_java.school_bussiness_tour_management.common.TransmittedDataShowData;
import group7_java.school_bussiness_tour_management.dao.TeacherDAO;
import group7_java.school_bussiness_tour_management.dao.TourDAO;
import group7_java.school_bussiness_tour_management.models.Teacher;
import group7_java.school_bussiness_tour_management.models.Tour;
import group7_java.school_bussiness_tour_management.services.TeacherService;
import group7_java.school_bussiness_tour_management.services.TourService;
import java.awt.Image;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN TRANG
 */
public class ManageToursOfTeacher extends javax.swing.JFrame {

    private String imagePath = "";
    private Teacher selectTeacher;

    public ManageToursOfTeacher(Teacher teacher) {
        this.selectTeacher = teacher;
        initComponents();
    }

    public ManageToursOfTeacher() {
        initComponents();
    }
    

    private int teacherId;

    public void setTeacherID(int teaID) {
        this.teacherId = teaID;
    }
    private DefaultTableModel tableModel;

    private void loadTableData() {
        try {
            List<Tour> data = TeacherService.listToursOfTeacher(teacherId);
            tableModel.setRowCount(0);
            if (data != null) {
                for (Tour tourItem : data) {
                    tableModel.addRow(new Object[]{
                        tourItem.getCode(), tourItem.getName(), tourItem.getStartDate(),
                        TeacherService.getNameCompanyFromIdCompany(tourItem.getCompanyId()),
                        TeacherService.getNumberOfStudents(tourItem.getStudentTours())
                    });
                }
            }
            tableModel.fireTableDataChanged();
        } catch (Exception e) {
            MessageDialog.showErrorDialog(this, "Tải dữ liệu cho bảng có lỗi! Chi tiết: " + e.getMessage(), "Có lỗi xảy ra");
            e.printStackTrace();
        }
    }

    public void initializeTable() {
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"Mã chuyến tham quan", "Tên chuyến tham quan", "Ngày tham quan", "Doanh nghiệp chủ quản", "Số lượng sinh viên tham gia"});
        toursTable.setModel(tableModel);
        loadTableData();
    }

    public void showImage() {
        // Hiển thị ảnh
        ImageIcon imageIcon = new ImageIcon(imagePath);

        // Chỉnh kích thước ảnh vừa với khung 
        Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backManageTeacher = new javax.swing.JButton();
        titleMain = new javax.swing.JLabel();
        teacherIdLabel = new javax.swing.JLabel();
        teacherPhoneNumberLabel = new javax.swing.JLabel();
        teacherNameLabel = new javax.swing.JLabel();
        teacherEmailLable = new javax.swing.JLabel();
        teacherAdressLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        toursTable = new javax.swing.JTable();
        showListStudents = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        addTourForTeacher = new javax.swing.JButton();
        deleteTourForTeacher = new javax.swing.JButton();
        exportFilePDF = new javax.swing.JButton();
        exportFileExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xem chi tour của giáo viên");

        backManageTeacher.setText("Quay lại trang trước");
        backManageTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backManageTeacherActionPerformed(evt);
            }
        });

        titleMain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleMain.setText("Các chuyến tham quan doanh nghiệp do giáo viên đại diện");

        teacherIdLabel.setText("Mã giáo viên: ");

        teacherPhoneNumberLabel.setText("Họ tên:");

        teacherNameLabel.setText("Số điện thoại: ");

        teacherEmailLable.setText("Email: ");

        teacherAdressLable.setText("Địa chỉ: ");

        toursTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(toursTable);

        showListStudents.setText("Xem danh sách sinh viên của chuyến đi");
        showListStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListStudentsActionPerformed(evt);
            }
        });

        imageLabel.setText("Ảnh");

        addTourForTeacher.setText("Thếm chuyến tham quan");
        addTourForTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTourForTeacherActionPerformed(evt);
            }
        });

        deleteTourForTeacher.setText("Xóa chuyến tham quan");
        deleteTourForTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTourForTeacherActionPerformed(evt);
            }
        });

        exportFilePDF.setText("Xuất danh sách PDF");
        exportFilePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportFilePDFActionPerformed(evt);
            }
        });

        exportFileExcel.setText("Xuất danh sách EXCEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(teacherNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherEmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleMain)
                                    .addComponent(teacherAdressLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125))))
                    .addComponent(backManageTeacher)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(addTourForTeacher)
                            .addGap(24, 24, 24)
                            .addComponent(deleteTourForTeacher)
                            .addGap(24, 24, 24)
                            .addComponent(exportFilePDF)
                            .addGap(24, 24, 24)
                            .addComponent(exportFileExcel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showListStudents))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backManageTeacher)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleMain)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherEmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(teacherAdressLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showListStudents)
                    .addComponent(addTourForTeacher)
                    .addComponent(deleteTourForTeacher)
                    .addComponent(exportFilePDF)
                    .addComponent(exportFileExcel))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showListStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListStudentsActionPerformed
        try {
            int index = toursTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui chọn chọn chọn chuyến tham quan để xem danh sách sinh viên tham quan", "Thông báo");
                return;
            }
            Tour selectedTour = TourService.getTourByIndex(index);
            dispose();
            TransmittedDataShowData data = new TransmittedDataShowData("studentTours", "managetoursofteacher", selectedTour.getId(), teacherId);
            ShowData showDataScreen = new ShowData(data);
            if (showDataScreen != null) {
                showDataScreen.setLocationRelativeTo(null);
                showDataScreen.setVisible(true);
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(this, "Có lỗi, chi tiết: " + e, "Lỗi");
        }
    }//GEN-LAST:event_showListStudentsActionPerformed

    private void backManageTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backManageTeacherActionPerformed
        dispose();
        ManageTeacher manageTeacherScreen = new ManageTeacher();
        manageTeacherScreen.setLocationRelativeTo(null);
        manageTeacherScreen.setVisible(true);
    }//GEN-LAST:event_backManageTeacherActionPerformed

    private void addTourForTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTourForTeacherActionPerformed
        try {
            ManageTour tourScreen = new ManageTour(selectTeacher.getId());
            if (tourScreen != null) {
                dispose();
                tourScreen.setLocationRelativeTo(null);
                tourScreen.setVisible(true);
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(this, "Có lỗi khi thêm chuyến tham quan cho giáo viên, chi tiết: " + e, "Lỗi");
        }
    }//GEN-LAST:event_addTourForTeacherActionPerformed

    private void deleteTourForTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTourForTeacherActionPerformed
         try {
            int index = toursTable.getSelectedRow();
            if (index == -1) {
                MessageDialog.showInfoDialog(this, "Vui lòng chọn chuyến tham quan mà bạn muốn xóa", "Thông báo");
                return;
            }

            int select = MessageDialog.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa chuyến tham quan này không", "Thông báo");
            if (select == 0) {
                List<Teacher> data_teacher = TeacherDAO.readFromFile();
                List<Tour> data_tour = TourDAO.readFromFile();
                String tourCode = (String) toursTable.getValueAt(index, 0);
                String tourName = (String) toursTable.getValueAt(index, 1);
                String tourDate = (String) toursTable.getValueAt(index, 2);
                List<Tour> tour_of_teacher = selectTeacher.getTours();
                int id = -1;

                // Sử dụng Iterator để lặp qua danh sách và loại bỏ phần tử
                Iterator<Tour> iterator = tour_of_teacher.iterator();
                while (iterator.hasNext()) {
                    Tour tour = iterator.next();
                    if (tour.getName().equalsIgnoreCase(tourName) && tour.getCode().equalsIgnoreCase(tourCode) && tour.getStartDate().equalsIgnoreCase(tourDate)) {
                        id = tour.getId();
                        iterator.remove(); // Loại bỏ phần tử hiện tại
                        break;
                    }
                }

                Tour selectTour = TourService.getTourById(id);
                for (Teacher item : data_teacher) {
                    if (item.getId() == selectTeacher.getId()) {
                        // Sử dụng Iterator để lặp qua danh sách và loại bỏ phần tử
                        Iterator<Tour> iteratorTeacher = item.getTours().iterator();
                        while (iteratorTeacher.hasNext()) {
                            Tour tour = iteratorTeacher.next();
                            if (tour.getId() == selectTour.getId()) {
                                iteratorTeacher.remove();
                                break;
                            }
                        }
                    }
                }

                for (Tour tour : data_tour) {
                    if (tour.getId() == id) {
                        tour.setTeacherId(selectTeacher.getId() - 100);
                        break;
                    }
                }

                TourDAO.writeToFile(data_tour);
                TeacherDAO.writeToFile(data_teacher);
                MessageDialog.showInfoDialog(this, "Xóa chuyến tham quan thành công", "Thông báo");
                loadTableData();
            }

        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, "Có lỗi khi xóa chuyến tham quan này của giáo viên, chi tiết: " + ex.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_deleteTourForTeacherActionPerformed

    private void exportFilePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportFilePDFActionPerformed
        PDFExporter.exportTableToPDF(toursTable, "DANH SÁCH CÁC CHUYẾN THAM QUAN CỦA GIÁO VIÊN " + selectTeacher.getLastName().toUpperCase() + selectTeacher.getFirstName().toUpperCase());
    }//GEN-LAST:event_exportFilePDFActionPerformed

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
            java.util.logging.Logger.getLogger(ManageToursOfTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageToursOfTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageToursOfTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageToursOfTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageToursOfTeacher().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTourForTeacher;
    private javax.swing.JButton backManageTeacher;
    private javax.swing.JButton deleteTourForTeacher;
    private javax.swing.JButton exportFileExcel;
    private javax.swing.JButton exportFilePDF;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showListStudents;
    private javax.swing.JLabel teacherAdressLable;
    private javax.swing.JLabel teacherEmailLable;
    private javax.swing.JLabel teacherIdLabel;
    private javax.swing.JLabel teacherNameLabel;
    private javax.swing.JLabel teacherPhoneNumberLabel;
    private javax.swing.JLabel titleMain;
    private javax.swing.JTable toursTable;
    // End of variables declaration//GEN-END:variables

    public JLabel getTeacherIdLabel() {
        return teacherIdLabel;
    }

    public JLabel getTeacherNameLabel() {
        return teacherNameLabel;
    }

    public JLabel getTeacherPhoneNumberLabel() {
        return teacherPhoneNumberLabel;
    }

    public JLabel getTeacherEmailLable() {
        return teacherEmailLable;
    }

    public JLabel getTeacherAdressLable() {
        return teacherAdressLable;
    }

    public JLabel getImageBrowse() {
        return imageLabel;
    }

    public void setImageBrowse(JLabel imageBrowse) {
        this.imageLabel = imageBrowse;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
        showImage();
    }

    public String getImagePath() {
        return imagePath;
    }

}
