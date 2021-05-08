package model;

import java.util.Scanner;

public class MLecture {
 private String id;
 private String lectureName;
 private String profName;
 private String credits;
 private String time;
 
 public MLecture() {}

 public boolean read(Scanner scan) {
  if(scan.hasNext()) {
   this.id = scan.next();
   this.lectureName = scan.next();
   this.profName = scan.next();
   this.credits = scan.next();
   this.time = scan.next();
   return true;
  }
  return false;
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

 public void setLecturename(String lecturename) {
  this.lectureName = lecturename;
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