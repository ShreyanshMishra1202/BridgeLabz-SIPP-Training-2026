public class SmartLibraryMembershipSystem {

    static class LibraryMember {
        protected String memberName;
        protected String memberId;

        LibraryMember(String memberName, String memberId) {
            this.memberName = memberName;
            this.memberId = memberId;
        }

        double calculateFine(int overdueDays) {
            return overdueDays * 2.0;
        }

        void printDetails() {
            System.out.println("Member Name: " + memberName + " | Member ID: " + memberId);
        }
    }

    static class StudentMember extends LibraryMember {
        StudentMember(String memberName, String memberId) {
            super(memberName, memberId);
        }

        @Override
        double calculateFine(int overdueDays) {
            return overdueDays * 1.0;
        }
    }

    static class FacultyMember extends LibraryMember {
        FacultyMember(String memberName, String memberId) {
            super(memberName, memberId);
        }

        @Override
        double calculateFine(int overdueDays) {
            return overdueDays * 0.5;
        }
    }

    static class GuestMember extends LibraryMember {
        GuestMember(String memberName, String memberId) {
            super(memberName, memberId);
        }

        @Override
        double calculateFine(int overdueDays) {
            return overdueDays * 3.0;
        }
    }

    static void printAllMembers(LibraryMember[] members) {
        for (LibraryMember member : members) {
            member.printDetails();
        }
    }

    static void printFines(LibraryMember[] members, int overdueDays) {
        for (LibraryMember member : members) {
            System.out.printf("%s -> Fine for %d overdue days: %.2f%n",
                member.memberName, overdueDays, member.calculateFine(overdueDays));
        }
    }

    static LibraryMember findById(LibraryMember[] members, String targetId) {
        for (LibraryMember member : members) {
            if (member.memberId.equals(targetId)) {
                return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Riya", "S101"),
            new FacultyMember("Dr. Mehta", "F502"),
            new GuestMember("Arjun", "G309")
        };

        printAllMembers(members);
        printFines(members, 6);

        String searchId = "F502";
        LibraryMember found = findById(members, searchId);
        if (found != null) {
            System.out.println("Found member with ID " + searchId + ": " + found.memberName);
        } else {
            System.out.println("No member found with ID " + searchId);
        }
    }
}
