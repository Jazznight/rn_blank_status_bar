/**
 * @format
 */
import { Navigation } from 'react-native-navigation';
import App from './App';
import {name as appName} from './app.json';

Navigation.registerComponent('test_bar.appScreen', () => App)
Navigation.events().registerAppLaunchedListener(() => {
  Navigation.setRoot({
    root: {
      stack: {
        children: [{
          component: {
            id: 'test_bar.appScreen',
            name: 'test_bar.appScreen',
          }
        }],
        options: {
          topBar: {
            visible: false,
            drawBehind: true,
            animate: false,
          }
        }
      }
    }
  });
})
