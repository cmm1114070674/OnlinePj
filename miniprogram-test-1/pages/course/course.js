// pages/course/course.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    selected: 0,
    list: ['课程详情', '课程章节', '作业'],
    userId: 0,
    courseList: [],
    courseId: 0,
    userList: [],
    studentList: [],
    collectionList: [],
    isChosen: false,
    isCollected: false,
  },

  click1:function() {
    var that = this;
    for (var i = 0; i < that.data.studentList.length; i++) {
    if (that.data.studentList[i].uid == that.data.userId)
      that.setData({
        isChosen: true,
      })
    }
    if(!that.data.isChosen)
      wx.request({
        url: 'http://139.155.143.116:8080/student/selectcourse?courseid='+that.data.courseId+'&UID='+that.data.userId,
      })
  },

  click2: function () {
    var that = this;
    for (var i = 0; i < that.data.collectionList.length; i++) {
      if (that.data.collectionList[i].uid == that.data.userId)
        that.setData({
          isCollected: true,
        })
    }
      wx.request({
        url: 'http://139.155.143.116:8080/collection/addfavo?courseid=' + that.data.courseId + '&UID=' + that.data.userId,
      })
  },

  selected: function (e) {
    console.log(e)
    let that = this
    let index = e.currentTarget.dataset.index
    console.log(index)
    if (index == 0) {
      // wx.navigateTo({
      //   url: '../course/course',
      // })
    } else if (index == 1) {
      wx.redirectTo({
        url: '../chapter/chapter?courseId=' + that.data.courseId + '&userId=' + that.data.userId + '&number=0' + '&total=0',
      })
    } else {
      wx.redirectTo({
        url: '../homework/homework?courseId=' + that.data.courseId + '&userId=' + that.data.userId + '&number=0' + '&total=0',
      })
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options.courseId);
    console.log(options.userId);
    var that = this;
    that.setData({
      courseId: options.courseId,
      userId: options.userId,
    })
    wx.request({
      url: 'http://139.155.143.116:8080/course/getcoursebyid?CourseID=' + options.courseId,
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          courseList: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/Users/getall',
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          userList: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/student/getbycourseid?courseid=' + options.courseId,
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          studentList: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/student/getbycourseid?courseid=' + options.courseId,
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          collectionList: res.data
        })
      },
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})