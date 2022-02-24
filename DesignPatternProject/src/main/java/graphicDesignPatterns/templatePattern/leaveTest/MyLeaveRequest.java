package graphicDesignPatterns.templatePattern.leaveTest;

public class MyLeaveRequest extends LeaveRequest {
    @Override
    String duration() {
        return "一天";
    }

    @Override
    String reason() {
        return "参加马拉松比赛";
    }

    @Override
    String name() {
        return "老王";
    }
}
