package hotel;

public class Rooms {
	private String roomNum;
	private User user;
	private boolean isAvail;
	private String checkInTime;
	private String checkOutTime;
	
	public Rooms() {}
	
	public Rooms(String roomNum, User user, boolean isAvail, String checkInTime, String checkOutTime) {
		this.roomNum = roomNum;
		this.user = user;
		this.isAvail = isAvail;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
	}
	
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isAvail() {
		return isAvail;
	}
	public void setAvail(boolean isAvail) {
		this.isAvail = isAvail;
	}
	public String getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	public String getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	@Override
	public String toString() {
		return "Rooms [roomNum=" + roomNum + ", user=" + user + ", isAvail=" + isAvail + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}
}
