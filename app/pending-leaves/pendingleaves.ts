export class Leavedetails {
    leaveId: number;
    empId:number;
    leaveNoOfDays:number;
    leaveStartDate:Date;
    leaveEndDate:String;
    leaveType:String;
    leaveStatus:String;
    leaveReason:String;
    leaveAppliedOn:Date;
    leaveManagerComment:String;
    constructor(id: number) {
      this.empId = id;
    }
}
