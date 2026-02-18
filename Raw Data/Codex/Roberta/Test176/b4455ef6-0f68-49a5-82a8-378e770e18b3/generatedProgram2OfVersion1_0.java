public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
    if (treeMap == null || treeMap.isEmpty()) { // Handle null or empty map
        return null;
    }

    return treeMap.lowerKey(key);  // Direct use of lowerKey() for efficiency
}
