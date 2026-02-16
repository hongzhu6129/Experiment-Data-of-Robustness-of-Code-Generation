  try {
      int lock1Num = Integer.parseInt(lock1);
      int lock2Num = Integer.parseInt(lock2);
      return Integer.compare(lock1Num, lock2Num);
  } catch (NumberFormatException e) {
      // Handle cases where lock names aren't valid numbers
      return lock1.compareTo(lock2); // Default to alphabetical
  }
  