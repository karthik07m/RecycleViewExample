export class applyleave{
    
    empId:number;
    leaveStartDate:Date;
    leaveEndDate:String;
    leaveType:String;
    leaveReason:String;
    leaveAppliedOn:Date;
    constructor(id: number) {
      this.empId = id;
    }
}