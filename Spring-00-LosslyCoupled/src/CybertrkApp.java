import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertrkApp {

    public static void main(String[] args) {
       //  FullTimeMentor fullTimeMentor=new FullTimeMentor();
        PartTimeMentor partTimeMentor=new PartTimeMentor();
        MentorAccount mentorAccount=new MentorAccount(partTimeMentor);

        mentorAccount.manageAccount();


    }
}
