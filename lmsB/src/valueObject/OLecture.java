package valueObject;


import model.MLecture;

public class OLecture {
 private String id;
 private String lectureName;
 private String profName;
 private String credits;
 private String time;
 

 public OLecture() {}


 public void set(MLecture mLecture) {
  this.id = mLecture.getId();
  this.lectureName = mLecture.getLectureName();
  this.profName = mLecture.getProfName();
  this.credits = mLecture.getCredits();
  this.time = mLecture.getTime();
 }
 
 public String getId() {
  return id;
 }
 public void setId(String id) {
  this.id = id;
 }
 public String getLectureName() {
  return lectureName;
 }
 public void setLecturename(String lectureName) {
  this.lectureName = lectureName;
 }
 public String getProfName() {
  return profName;
 }
 public void setProfName(String profName) {
  this.profName = profName;
 }
 public String getCredits() {
  return credits;
 }
 public void setCredits(String credits) {
  this.credits = credits;
 }
 public String getTime() {
  return time;
 }
 public void setTime(String time) {
  this.time = time;
 }
} 