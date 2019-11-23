
/*
* Leetcode 346 - Moving average data stream
*/

class MovingAverage {
    
    private Queue<Integer> q = null;
    private int initsize ;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.q = new LinkedList<>();
        this.initsize = size;
    }
    
    public double next(int val) {
        //if the current q size is greater than initsize, pop out the element at the head
    
        if(q.size() > initsize - 1) {
            q.poll();
        }
        //else add val to q and calculate avg of all elements in q 
        // avg = (sum of elements/q size)
        q.offer(val);
        Iterator<Integer> itr = q.iterator();
        int sum = 0;
        
        while(itr.hasNext()) {
            sum += itr.next();
        }
        
        return Double.valueOf(sum*1.0/q.size() * 1.0);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */