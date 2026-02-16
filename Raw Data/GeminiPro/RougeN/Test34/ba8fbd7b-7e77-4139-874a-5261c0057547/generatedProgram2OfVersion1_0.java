   // In a unit test (using JUnit or a similar framework)
   @Test
   public void testEmptyCharsets() {
       // Mocking or stubbing the Charset class would be required
       // to force availableCharsets() to return an empty map.
       // This usually requires a mocking library like Mockito.

       // Example using Mockito (you'll need to add Mockito to your dependencies):
       SortedMap<String, Charset> emptyMap = new TreeMap<>(); 
       try (MockedStatic<Charset> mockedCharset = Mockito.mockStatic(Charset.class)) {
           mockedCharset.when(Charset::availableCharsets).thenReturn(emptyMap);
           ByteArrayOutputStream outContent = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outContent));
           ListAvailableCharsets.listCharsets();
           assertEquals("Available Character Sets:\n", outContent.toString()); // Expecting only the header
       }
   }
   