Charset utf8 = Charset.forName("UTF-8");
Charset utf8Lower = Charset.forName("utf-8");
System.out.println("UTF-8 and utf-8 are the same: " + utf8.equals(utf8Lower)); // Should print true
