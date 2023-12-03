/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7_java.school_bussiness_tour_management.models;

import java.util.List;

/**
 *
 * @author PC
 */
public class Tour {

    public static int count = 0;

    private int id;
    private String code;
    private String name;
    private String description;
    private String startDate;
    private String availables; // number of seats for a tour, ex: 100 => 100 students can be engaged in this tour
    private List<StudentTour> studentTours;
    private int companyId;
    private int teacherId;
    private String presentator;

    public Tour() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getAvailables() {
        return availables;
    }

    public void setAvailables(String availables) {
        this.availables = availables;
    }

    public List<StudentTour> getStudentTours() {
        return studentTours;
    }

    public void setStudentTours(List<StudentTour> studentTours) {
        this.studentTours = studentTours;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getPresentator() {
        return presentator;
    }

    public void setPresentator(String presentator) {
        this.presentator = presentator;
    }

    @Override
    public String toString() {
        return "Tour{" + "id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", startDate=" + startDate + ", availables=" + availables + ", studentTours=" + studentTours + ", companyId=" + companyId + ", teacherId=" + teacherId + ", presentator=" + presentator + '}';
    }

}
