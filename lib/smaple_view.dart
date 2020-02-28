import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';

class SampleView extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    const viewTypeId = 'sm9i.com/android_view';
    if (defaultTargetPlatform == TargetPlatform.android) {
      return AndroidView(viewType: viewTypeId);
    } else {
      return Container();
    }
  }
}
