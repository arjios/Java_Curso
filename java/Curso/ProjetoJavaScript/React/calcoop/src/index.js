import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Calc from "./Principal/Calc";
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
    <div>
        <Calc />
    </div>
    , document.getElementById('root'));
serviceWorker.unregister();
