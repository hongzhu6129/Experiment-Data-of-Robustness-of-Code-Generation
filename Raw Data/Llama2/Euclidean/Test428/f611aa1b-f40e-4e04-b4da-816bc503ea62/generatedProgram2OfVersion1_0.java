Locale originalLocale = Locale.getDefault();
Locale.setDefault(new Locale("fr", "FR")); // Set to French (France)
String dateTime = getCurrentDateTime();
System.out.println(dateTime); // Observe the French abbreviations
Locale.setDefault(originalLocale); // Restore original locale
