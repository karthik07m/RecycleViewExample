package com.hexaware.ftp93.model;

import java.util.Objects;

import com.hexaware.ftp93.persistence.DbConnection;
import com.hexaware.ftp93.persistence.LeaveDetailsDAO;



import com.hexaware.ftp93.persistence.EmployeeDAO;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * LeaveDetails class to store leave manager details.
 * @author hexware
 */
public class LeaveDetails {

  /**
   * lvdId to store leave id. lvdNoOfDays to store no of days of leave.
   * lvdStarDate to store start date of leave. lvdEndDate to store end date of
   * date. lvdLeaveType to store leave type. lvdStatus to store the leave status.
   * lvdReason to store the leave reason. lvdAppliedOn to store the applied date.
   * lvdManagerComments to store manager comments.
   */
  private static int empId;
  private int lvdId;
  private static int lvdNoOfDays;
  private Date lvdStartDate;
  private Date lvdEndDate;
  private LeaveType lvdLeaveType;
  private LeaveStatus lvdLeaveStatus;
  private String lvdleaveStatusML;
  private String lvdReason;
  private Date lvdAppliedOn;
  private String lvdManagerComments;

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LeaveDetails lvd = (LeaveDetails) obj;
    if (Objects.equals(empId, lvd.empId) && Objects.equals(lvdId, lvd.lvdId)
        && Objects.equals(lvdNoOfDays, lvd.lvdNoOfDays) && Objects.equals(lvdStartDate, lvd.lvdStartDate)
        && Objects.equals(lvdEndDate, lvd.lvdEndDate) && Objects.equals(lvdLeaveType, lvd.lvdLeaveType)
        && Objects.equals(lvdLeaveStatus, lvd.lvdLeaveStatus) && Objects.equals(lvdReason, lvd.lvdReason)
        && Objects.equals(lvdAppliedOn, lvd.lvdAppliedOn)
        && Objects.equals(lvdManagerComments, lvd.lvdManagerComments)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(empId, lvdId, lvdNoOfDays, lvdStartDate, lvdEndDate, lvdLeaveType, lvdLeaveStatus, lvdReason,
        lvdAppliedOn, lvdManagerComments);
  }

  /**
   * @param argEmpId              to initialize employee id.
   * @param argLvdId              to initialize leave id.
   * @param arglvdNoOfDays        to initialize lvdNoOfDays.
   * @param arglvdStartDate       to initialize lvdStartDate.
   * @param arglvdEndDate         to initialize lvdEndDate.
   * @param arglvdLeaveType       to initialize lvdLeaveType
   * @param arglvdLeaveStatus     to initialize lvdLeaveStatus
   * @param arglvdLeaveStatusML   to initialize lvdLeaveStatus
   * @param arglvdReason          to initialize lvdReason.
   * @param arglvdAppliedOn       to initialize lvdAppliedOn.
   * @param arglvdManagerComments to initialize lvdManagerComments.
   */

  public LeaveDetails(final int argEmpId, final int argLvdId, final int arglvdNoOfDays, final Date arglvdStartDate,
      final Date arglvdEndDate, final LeaveType arglvdLeaveType, final LeaveStatus arglvdLeaveStatus,
      final String arglvdLeaveStatusML,
      final String arglvdReason, final Date arglvdAppliedOn, final String arglvdManagerComments) {
    this.empId = argEmpId;
    this.lvdId = argLvdId;
    this.lvdNoOfDays = arglvdNoOfDays;
    this.lvdStartDate = arglvdStartDate;
    this.lvdEndDate = arglvdEndDate;
    this.lvdLeaveType = arglvdLeaveType;
    this.lvdLeaveStatus = arglvdLeaveStatus;
    this.lvdleaveStatusML = arglvdLeaveStatusML;
    this.lvdReason = arglvdReason;
    this.lvdAppliedOn = arglvdAppliedOn;
    this.lvdManagerComments = arglvdManagerComments;
  }

  /**
   * Gets the EmployeId.
   * @return this Employee ID.
   */
  public final int getEmpId() {
    return empId;
  }

  /**
   * Gets the LeaveId.
   * @return this Leave ID.
   */
  public final int getLvdId() {
    return lvdId;
  }

  /**
   * Gets the LeavesNoOfDays.
   * @return this Leaves No Of Days.
   */
  public static int getLvdNoOfDays() {
    return lvdNoOfDays;
  }

  /**
   * Gets the LeaveStartDate.
   * @return this Leave Start Date.
   */
  public final Date getLvdStartDate() {
    return lvdStartDate;
  }

  /**
   * Gets the LeaveEndDate.
   * @return this Leave End Date.
   */
  public final Date getLvdEndDate() {
    return lvdEndDate;
  }

  /**
   * Gets the LeaveType.
   * @return this Leave Type.
   */
  public final LeaveType getLvdLeaveType() {
    return lvdLeaveType;
  }

  /**
   * Gets the LeaveStatus.
   * @return this Leave Status.
   */
  public final LeaveStatus getLvdLeaveStatus() {
    return lvdLeaveStatus;
  }

   /**
   * Gets the LeaveStatus.
   * @return this Leave Status.
   */
  public final String getLvdLeaveStatusML() {
    return lvdleaveStatusML;
  }

  /**
   * Gets the LeaveReason.
   * @return this Leave Reason.
   */
  public final String getLvdReason() {
    return lvdReason;
  }

  /**
   * Gets the LeaveAppliedOn.
   * @return this Leave Applied On.
   */
  public final Date getLvdAppliedOn() {
    return lvdAppliedOn;
  }

  /**
   * Gets the ManagerComments.
   * @return this Leave Manager Comments.
   */
  public final String getManagerComments() {
    return lvdManagerComments;
  }

  /**
   * @param argEmpId to set leave id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }

  /**
   * @param argLvdId to set leave id.
   */
  public final void setLvdId(final int argLvdId) {
    this.lvdId = argLvdId;
  }

  /**
   * @param argLvdNoOfDays to set leave No Of Days.
   */
  public final void setLvdNoOfDays(final int argLvdNoOfDays) {
    this.lvdNoOfDays = argLvdNoOfDays;
  }

  /**
   * @param argStartDate to set Leave Start Date.
   */
  public final void setStartDate(final Date argStartDate) {
    this.lvdStartDate = argStartDate;
  }

  /**
   * @param argLvdEndDate to set Leave End Date.
   */
  public final void setEndDate(final Date argLvdEndDate) {
    this.lvdEndDate = argLvdEndDate;
  }

  /**
   * @param argLvdLeaveType to set Leave Type.
   */
  public final void setLvdLeaveType(final LeaveType argLvdLeaveType) {
    this.lvdLeaveType = argLvdLeaveType;
  }

  /**
   * @param argLvdLeaveStatus to set Leave Status.
   */
  public final void setLvdLeaveStatus(final LeaveStatus argLvdLeaveStatus) {
    this.lvdLeaveStatus = argLvdLeaveStatus;
  }

  /**
   * @param argLvdLeaveStatusML to set Leave Status.
   */
  public final void setLvdLeaveStatusML(final String argLvdLeaveStatusML) {
    this.lvdleaveStatusML = argLvdLeaveStatusML;
  }

  /**
   * @param argLvdReason to set Leave Reason.
   */
  public final void setLvdReason(final String argLvdReason) {
    this.lvdReason = argLvdReason;
  }

  /**
   * @param argLvdAppliedOn to set Leave Applied On.
   */
  public final void setLvdAppliedOn(final Date argLvdAppliedOn) {
    this.lvdAppliedOn = argLvdAppliedOn;
  }

  /**
   * @param argLvdManagerComments to set Leave Manager Comments.
   */
  public final void setLvdManagerComments(final String argLvdManagerComments) {
    this.lvdManagerComments = argLvdManagerComments;
  }

  @Override
  public final String toString() {
    return "EmployeeID:" + empId + "LeaveId:" + lvdId + "NoOfDays:" + lvdNoOfDays + "StartDate:" + lvdStartDate
        + "EndDate:" + lvdEndDate + "lvdleavetype:" + lvdLeaveType + "lvdstatus:" + lvdLeaveStatus + "lvdReason:"
        + lvdReason + "lvdAppliedOn:" + lvdAppliedOn + "lvdmanagercomments:" + lvdManagerComments;
  }

  /**
   * Method for Approve or Deny the Leave.
   * @param leaveId     to enter LeaveId to approve/deny.
   * @param status      to enter status to approve/deny.
   * @param mgrComments to get manager comments.
   * @return String.
   */
  public static String managerAction(final int leaveId, final String status, final String mgrComments) {
    int noOfDays = getLvdNoOfDays();
    LeaveDetails ld = dao().findLeave(leaveId);
    int empID = ld.getEmpId();
    Employee employee = edao().find(empID);
    int availaBal = employee.getEmpLeaveBalance();
    int remainingBal = availaBal - noOfDays;
    int total = availaBal + noOfDays;
    String dbstatus = null;
    String result = "";
    String status1 = status.toLowerCase();
    System.out.println(ld.lvdLeaveType.toString());
    if (status1.equals("approved")) {
      if (ld.getLvdLeaveStatus().toString().equals("APPROVED")
          || ld.getLvdLeaveStatus().toString().equals("PENDING BY HR")) {
        result = "You have already approved";
      } else if (ld.lvdLeaveType.toString().equals("ML")) {
        dbstatus = "PENDING BY HR";
        dao().mgrcommnetsML(mgrComments, dbstatus, leaveId);
        result = "*** Successfully approved by manager. Should also approved by Hr ****";
      } else {
        dbstatus = "APPROVED";
        dao().mgrcommnets(mgrComments, dbstatus, leaveId);
        result = "Approved Successfully";
        edao().updateBal(empID, remainingBal);
      }
    } else if (status1.equals("denied")) {
      if (ld.getLvdLeaveStatus().toString().equals("DENIED")) {
        result = "You have already denied";
      } else if (ld.lvdLeaveType.toString().equals("ML")) {
        dbstatus = "DENIED";
        dao().mgrcommnetsML(mgrComments, dbstatus, leaveId);
        result = "Denied by manager";
        edao().updateBal(empID, total);
      } else if (ld.getLvdLeaveStatus().toString().equals("APPROVED")) {
        dbstatus = "DENIED";
        edao().updateBal(empID, total);
        dao().mgrcommnets(mgrComments, dbstatus, leaveId);
        result = "Denied Permission";
      } else {
        dbstatus = "DENIED";
        dao().mgrcommnets(mgrComments, dbstatus, leaveId);
        result = "Denied Permission";
      }
    } else {
      result = "Please enter valid String";
    }
    return result;
  }
  /**
   * Method for Approve or Deny the Leave.
   * @param leaveId     to enter LeaveId to approve/deny.
   * @param status      to enter status to approve/deny.
   * @param mgrComments to get manager comments.
   * @return String.
   */
  public static String hrManagerAction(final int leaveId, final String status, final String mgrComments) {
    LeaveDetails ld = dao().findLeave(leaveId);
    int empID = ld.getEmpId();
    Employee employee = edao().find(empID);
    String dbstatus = null;
    String result = "";
    String status1 = status.toLowerCase();
    int availaBal = employee.getEmpLeaveBalance();
    int remainingBal = availaBal - ld.getLvdNoOfDays();
    //int total = availaBal + ld.getLvdNoOfDays();
    // if (ld.lv)
    if (status1.equals("approved")) {
      if (ld.getLvdLeaveStatusML().equals("PENDING")) {
        System.out.println("First it has to be approved by manager");
      } else if (ld.getLvdLeaveStatus().toString().equals("APPROVED")) {
        result = "You have already approved";
      } else {
        dbstatus = "APPROVED";
        dao().mgrcommnetsML(mgrComments, dbstatus, leaveId);
        result = "**** HR APPROVAL SUCCESSFUL ***";
        edao().updateBal(empID, remainingBal);
      }
    } else if (status1.equals("denied")) {
      if (ld.getLvdLeaveStatus().toString().equals("APPROVED")) {
        result = "You have already approved";
      } else {
        dbstatus = "denied";
        dao().mgrcommnetsML(mgrComments, dbstatus, leaveId);
        result = "**** DENIED ****";
      }
    } else {
      result = "***** Enter a valid leave type ****";
    }
    return result;
  }

  /**
   * The dao for EmployeeDetails.
   */
  private static EmployeeDAO edao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * /** The dao for LeaveDetails.
   */
  private static LeaveDetailsDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(LeaveDetailsDAO.class);
  }

  /**
   * list all employee leave details.
   * @return all employees' leave details
   */
  public static LeaveDetails[] listAll() {
    List<LeaveDetails> es = dao().list();
    return es.toArray(new LeaveDetails[es.size()]);
  }

  /**
   * list all employee leave details.
   * @return all employees' leave details
   */
  public static LeaveDetails[] hrPendings() {
    List<LeaveDetails> es = dao().hrPending();
    return es.toArray(new LeaveDetails[es.size()]);
  }

  /**
   * list all employee leave details.
   * @param mgrId id to get employee leave details.
   * @return all employees' leave details
   */
  public static LeaveDetails[] listPending(final int mgrId) {
    List<LeaveDetails> es = dao().pending(mgrId);
    return es.toArray(new LeaveDetails[es.size()]);
  }

  /**
   * list leave details by id.
   * @param leaveId id to get leave details.
   * @return LeaveDetails
   */
  public static LeaveDetails listById(final int leaveId) {
    return dao().findLeave(leaveId);
  }

  /**
   * list leave details by id.
   * @param empID id to get leave details.
   * @return LeaveDetail
   */
  public static LeaveDetails[] leaveHis(final int empID) {
    List<LeaveDetails> es = dao().empHistory(empID);
    return es.toArray(new LeaveDetails[es.size()]);
  }

  /**
   * Applyy Leave for employee.
   * @param empid       id to set employee id.
   * @param startDate   id to set employee startDate.
   * @param endDate     id to set employee endDate.
   * @param leaveType   id to set employee leaveType.
   * @param leaveReason id to set employee leaveReason.
   * @throws ParseException throws parse exception.
   * @return error messages
   */
  public static String applyProcess(final int empid, final String startDate, final String endDate,
      final String leaveType, final String leaveReason) throws ParseException {
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    Employee emp = Employee.listById(empid);
    String msg = "";
    int mgrId = emp.getEmpManagerId();
    Date today = new Date();
    Date strDate = sf.parse(startDate);
    Date enDate = sf.parse(endDate);
    long diff = enDate.getTime() - strDate.getTime();
    long leavedays = diff / (1000 * 60 * 60 * 24);
    leavedays = leavedays + 1;
    int availableBal = emp.getEmpLeaveBalance() - (int) leavedays;
    int overLap = countNo(empid, startDate, endDate);
    //String eL = LeaveType.valueOf("EL").toString();
    /*if (!leaveType.toUpperCase().equals(eL)) {
      msg = "***** Please enter valid leave type *****";
    } else */
    if (overLap > 0) {
      msg = "***** You have already applied for the leave. ****";
    } else if (strDate.compareTo(today) == -1) {
      msg = "**** Invalid start date. Start date cann't be past ****";
    } else if (leavedays <= 0) {
      System.out.println("**** End date is greater than start date. Please enter a valid End date. ****");
    } else {
      dao().insert(empid, leavedays, startDate, endDate, leaveType.toUpperCase(), leaveReason, sf.format(today));
      msg = "**** Your leave request succcessfully recored " + "form :" + startDate + " - " + endDate + " for: "
          + leavedays + "days" + " ****";
      if (mgrId == 0) {
        if (leaveType.toString().equals("EL")) {
          dao().updateCEO(empid);
        } else {
          dao().updateCEOML(empId);
        }
        edao().updateBal(empid, availableBal);
      }
    }
    return msg;
  }

  /**
   * No overlapping Leaves.
   * @param empid     id to get employee details.
   * @param startDate start date.
   * @param endDate   end date.
   * @return count of no of employee.
   */
  public static int countNo(final int empid, final String startDate, final String endDate) {
    int count = dao().count(empid, startDate, endDate);
    return count;
  }
}
