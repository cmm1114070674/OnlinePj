// pages/myinformation/myinformation.js

const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    selected: 2,
    list: ['首页', '我的课程', '我'],
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    userId: 0,
    courseList: [],
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
      wx.redirectTo({
        url: '../mycourse/mycourse?userId=' + that.data.userId + '&nickName=' + that.data.nickName,
      })
    } else {
      // wx.redirectTo({
      //   url: '../myinformation/myinformation',
      // })
    }
  },

  //事件处理函数
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
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
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse) {
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },
  getUserInfo: function (e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
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