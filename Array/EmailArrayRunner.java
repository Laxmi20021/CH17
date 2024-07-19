class EmailArrayRunner {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array to store 15 emails
        String[] emails = new String[15];

        // Step 2: Assign email addresses to the array
        emails[0] = "email1@example.com";
        emails[1] = "email2@example.com";
        emails[2] = "email3@example.com";
        emails[3] = "email4@example.com";
        emails[4] = "email5@example.com";
        emails[5] = "email6@example.com";
        emails[6] = "email7@example.com";
        emails[7] = "email8@example.com";
        emails[8] = "email9@example.com";
        emails[9] = "email10@example.com";
        emails[10] = "email11@example.com";
        emails[11] = "email12@example.com";
        emails[12] = "email13@example.com";
        emails[13] = "email14@example.com";
        emails[14] = "email15@example.com";

        // Step 3: Print all elements in the array
        for (int i = 0; i < emails.length; i++) {
            System.out.println(emails[i]);
        }
    }
}