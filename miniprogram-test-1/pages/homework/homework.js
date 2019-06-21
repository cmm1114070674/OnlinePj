// pages/homework/homework.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    selected: 2,
    list: ['课程详情', '课程章节', '作业'],
    userId: 0,
    courseId: 0,
    courseUnitList: [],
    courseCellList: [],
    homeworkList: [],
    cellsAllList: [],
    number: 0,
    total: 0,
    isQuestion:false,
    executionList: [],
  },

  click1: function () {
    var that = this;
    for (var j = 0; j < that.data.courseUnitList.length; j++){
      for (var i = 0; i < that.data.courseCellList.length; i++) {
        if (that.data.courseUnitList[j].unitId == that.data.courseCellList[i].unitId)
          that.setData({
            cellsAllList: that.data.courseCellList,
          })
      }
    }
    that.setData({
      number: that.data.number+1,
    })
    that.setData({
      isQuestion: false,
    })
  },

  click2: function () {
    var that = this;
    that.setData({
      total: that.data.total + 1,
    })
    that.setData({
      isQuestion: true,
    })
  },

  selected: function (e) {
    console.log(e)
    let that = this
    let index = e.currentTarget.dataset.index
    console.log(index)
    if (index == 0) {
      wx.navigateTo({
        url: '../course/course?courseId=' + that.data.courseId + '&userId=' + that.data.userId + '&number=0' + '&total=0',
      })
    } else if (index == 1) {
      wx.redirectTo({
        url: '../chapter/chapter?courseId=' + that.data.courseId + '&userId=' + that.data.userId + '&number=0' + '&total=0',
      })
    } else {
      // wx.redirectTo({
      //   url: '../homework/homework',
      // })
    }
  },

  GetName:function(e){
    var val = e.detail.value.note;
    console.log('user', val);
    var that = this;
    if(!that.data.isQuestion){
      wx.request({
        url: 'http://139.155.143.116:8080/note/addnote?UID=' + that.data.userId + '&COURSEID=' + that.data.courseId + '&DESCRI=' + val,
      })
    }
    if(that.data.isQuestion){
      wx.request({
        url: 'http://139.155.143.116:8080/Execution/handhomework?HID='+ that.data.homeworkList[that.data.total.length-2].hid +'&UID=' + that.data.userId + '&SCORE=-1&DESCRI=' + val,
      })
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options.courseId);
    console.log(options.userId);
    console.log(options.number); 
    console.log(options.total);
    var that = this;
    that.setData({
      courseId: options.courseId,
      userId: options.userId,
      number: options.number,
      total: options.total,
    })
    wx.request({
      url: 'http://139.155.143.116:8080/courseunit/getbycourseid?courseid=' + options.courseId,
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          courseUnitList: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/coursecell/getall',
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          courseCellList: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/homework/getcoursehomework?Course=' + options.courseId,
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          homeworkList: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/Execution/getbyUID?UID=' + options.userId,
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          executionList: res.data
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