        byte[] byteArray = new byte[(int) file.length()]; // Allocate the byte array
        int bytesRead = fis.read(byteArray);            // Read into the array
        if (bytesRead != file.length()) {
            System.err.println("Error: Could not read the entire file.");
            return;
        }
