// pages/mycourse/mycourse.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    selected: 1,
    list: ['首页', '我的课程', '我'],
    userId: 0,
    courseList: [],
    studentList: [],
    userList: [],
    collectionList: [],
    nickName: [],
  },

  selected: function (e) {
    console.log(e)
    let that = this
    let index = e.currentTarget.dataset.index
    console.log(index)
    if (index == 0) {
      wx.redirectTo({
        url: '../homepage/homepage?userId=' + that.data.userId + '&nickName=' + that.data.nickName,
      })
    } else if (index == 1) {
      // wx.navigateTo({
      //   url: '../mycourse/mycourse',
      // })
    } else {
      wx.redirectTo({
        url: '../myinformation/myinformation?userId=' + that.data.userId + '&nickName=' + that.data.nickName,
      })
    }
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options.userId);
    var that = this;
    that.setData({
      userId: options.userId,
      nickName: options.nickName,
    })
    wx.request({
      url: 'http://139.155.143.116:8080/course/getall',
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
      url: 'http://139.155.143.116:8080/student/getbyUID?UID=' + options.userId,
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
      url: 'http://139.155.143.116:8080/collection/getbyUID?UID=' + options.userId,
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