public static void rotateLeft(final String[] array) {
        
        // TODO: Implement me.
    	String temp = array[0]; //Merke ersten Eintrag um letzten zu ersetzen
    	
    	/*Array von links durchgehen und den i-ten Eintrag mit dem i+1-ten Eintrag ersetzen.
    	  Damit bleiben die Werte erhalten, im Gegensatz zu wenn man von links nach rechts
    	  die Einträge ersetzt.
    	*/
    	if (array != null && array.length > 0) {
    		for (int i = 0; i < array.length-1; i++) {
    			array[i] = array[i+1];
    		}
    		array[array.length-1] = temp; //ersetze lezten Eintrag mit ersten
    	}
    }
    
    // ----------------------------------------------------------------
    // Exercise 2 (e)
    // ----------------------------------------------------------------
    public static void rotateRight(final String[] array) {
        
        // TODO: Implement me.
    	String temp = array[array.length-1];
    	
    	if(array != null && array.length > 0) {
    		for(int i = array.length-1; i > 0; i--) {
    			array[i] = array[i-1];
    		}
    		array[0] = temp;
    	}
    }
