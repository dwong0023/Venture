package People;

public class Team {
    public Member[] members;
    public int teamindex;

    public Team(Member[] members)
    {
        this.members = members;
    }

    public void addMembers(Member m, int teamindex)
    {
        members[teamindex] = m;
    }

    public void statusCheck(Member members[])
    {
            for(Member i : members)
            {
                System.out.print(i);
            }
    }

    public void statusCheck(Member members[][])
    {
        for(Member[] i : members)
        {
            for (Member j : i)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
