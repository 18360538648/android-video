# android-video
android ijkplayer 视频播放
代码参考
[jjdxm_ijkplayer](https://github.com/jjdxmashl/jjdxm_ijkplayer)，由于jjdxm_ijkplayer有些地方用的不适应就更改了其源码，并借这个项目上传到jcenter，
具体请看jjdxm_ijkplayer的源码和使用方法。

## 1. 在 buld.gradle 中添加依赖
```
compile 'com.lsw:playvideo:1.0.0'
```
## 2. 在XML布局文件中添加
```
<include
        layout="@layout/simple_player_view_player"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

## 3. 添加网络请求权限
```
<uses-permission android:name="android.permission.INTERNET"></uses-permission>
```

## 4. 使用方法示例

```
PlayerView playerView;
playerView = new PlayerView(this)
                .setProcessDurationOrientation(PlayStateParams.PROCESS_PORTRAIT)
                .setScaleType(PlayStateParams.fillparent)
                .forbidTouch(false)
                .hideBack(true)
                .hideMenu(true)
                .hideSteam(true)
                .hideFullscreen(true)
                .hideCenterPlayer(false)
                .setForbidDoulbeUp(true)
                .clickFinish(true)
                .setNetWorkTypeTie(false)
                .setPlaySource("http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4").startPlay();
```



