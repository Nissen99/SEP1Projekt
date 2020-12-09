package LogikLag;

public class TestLogik
{
  public static void main(String[] args)
  {
    Employee mikkel = new Employee("Mikkel");
    Employee mikkel2 = new Employee("Mikkel2");
    Employee mikkel3 = new Employee("Mikkel3");
    Employee mikkel4 = new Employee("Mikkel4");
    Employee mikkel5 = new Employee("Mikkel5");

   TeamMemberList teamMemberList = new TeamMemberList();
    System.out.println(mikkel.getRole());

    teamMemberList.addTeamMember(mikkel);
    teamMemberList.addTeamMember(mikkel2);
    teamMemberList.addTeamMember(mikkel3);
    teamMemberList.addTeamMember(mikkel4);
    teamMemberList.addTeamMember(mikkel5);

    System.out.println(teamMemberList.getAllTeamMembers().get(0).getRole());

    mikkel.setRole("Whatever");

    System.out.println(mikkel.getRole());

    System.out.println(teamMemberList.getAllTeamMembers().get(0).getRole());
  }
}
