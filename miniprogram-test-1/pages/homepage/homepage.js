// pages/homepage/homepage.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    selected: 0,
    list: ['首页', '我的课程', '我'],
    courseList : [],
    courseListByHot: [],
    courseListByDate: [],
    userList: [],
    userId: 0,
    nickName: [],
  },

  selected: function (e) {
    console.log(e)
    let that = this
    let index = e.currentTarget.dataset.index
    console.log(index)
    if (index == 0) {
      // wx.navigateTo({
      //   url: '../homepage/homepage',
      // })
    } else if (index == 1) {
      wx.redirectTo({
        url: '../mycourse/mycourse?userId=' + that.data.userId +'&nickName='+ that.data.nickName,
      })
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
    console.log(options.nickName);
    var that = this;
    that.setData({
      userId: options.userId,
      nickName: options.nickName
    })
    var s = options.nickName.length + 100; 
    wx.request({
      url: 'http://139.155.143.116:8080/Users/adduser?UID=' + s + '&USERNAME=' + options.nickName + '&PASS=ss',
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
      },
    })
    that.setData({
      userId: s,
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
      url: 'http://139.155.143.116:8080/course/getbyhot',
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          courseListByHot: res.data
        })
      },
    })
    wx.request({
      url: 'http://139.155.143.116:8080/course/getall',
      header: { 'content-type': 'application/json' },
      success: function (res) {
        console.log(res);
        console.log(res.data);
        that.setData({
          courseListByDate: res.data
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