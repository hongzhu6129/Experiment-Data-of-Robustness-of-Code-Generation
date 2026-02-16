   String path = System.getenv("PATH"); // Example
   if (path != null) {
       System.out.println("PATH: " + path);
   } else {
       System.out.println("PATH environment variable is not set.");
   }
   