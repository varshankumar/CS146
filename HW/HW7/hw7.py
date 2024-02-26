from queue import PriorityQueue

def minMeetingRooms(self, intervals: list[list[int]]) -> int:
    servers=PriorityQueue()
    intervals.sort()
    for start, end in intervals:
        if not servers.empty() and servers.queue[0] <=start:
            servers.get()
        servers.put(end)

    return servers.qsize()

intervals=[[0,30],[5,10],[15,20]]
print(minMeetingRooms(None, intervals))
intervals = [[0,1],[1,2],[2,3]]
print(minMeetingRooms(None, intervals))