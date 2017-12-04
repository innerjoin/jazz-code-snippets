IWorkItem wi = ....;
IWorkflowInfo workFlowInfo = workItemServer.findCachedWorkflowInfo(wi);
if (workFlowInfo == null) {
    workFlowInfo = workItemServer.findWorkflowInfo(wi, monitor);
}
IAuditableHandle[] history = iItemService.fetchAllStates((IAuditableHandle) wi.getStateHandle());
response.getWriter().write("\n"+ wi.getId() + " - Record history details:\n");
String currentwiStatus = workFlowInfo.getStateName(wi.getState2());
if(currentwiStatus != null && currentwiStatus.equals(existingExportRecord.getStatus()))
response.getWriter().write("date: "+ wi.modified() + "  : Status: " + currentwiStatus + "\n\n");
for(int i = history.length -1; i >= 0; i--){
    IAuditableHandle audit = (IAuditableHandle) history[i];
    IWorkItem workItemPrevious = (IWorkItem) iItemService.fetchState(audit,null);
    Date recordModifiedDate = workItemPrevious.modified();
    String wiStatus = workFlowInfo.getStateName(workItemPrevious.getState2());
    response.getWriter().write("date: "+recordModifiedDate + "  : Status: " + wiStatus + "\n");
}
