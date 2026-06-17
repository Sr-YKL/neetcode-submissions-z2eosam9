class MyCalendar {
    
    public TreeMap<Integer, Integer> eventTree;

    public MyCalendar() {
         this.eventTree = new TreeMap<>();
    }
    
    public boolean book(int startTime, int endTime) {

        // Evento anterior (maior start <= startTime)
        Map.Entry<Integer, Integer> prev = eventTree.floorEntry(startTime);
        // Evento seguinte (menor start >= startTime)
        Map.Entry<Integer, Integer> next = eventTree.ceilingEntry(startTime);

        // Conflito com o anterior: o end dele passa do meu start?
        if (prev != null && prev.getValue() > startTime)
            return false;

        // Conflito com o seguinte: o start dele é antes do meu end?
        if (next != null && next.getKey() < endTime)
            return false;

        eventTree.put(startTime, endTime);
        return true;
    }
}


/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */