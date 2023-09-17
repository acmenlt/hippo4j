import { IRouterList } from '@/typings';
import homeRouter from '@/page/home/router';
import aboutRouter from '@/page/about/router';
import tenantRouter from '@/page/tenant/router';
import itemRouter from '@/page/item/router';
import userRouter from '@/page/user/router';
import logRouter from '@/page/log/router';

const routerList: IRouterList[] = [
  ...homeRouter,
  ...aboutRouter,
  ...tenantRouter,
  ...itemRouter,
  ...userRouter,
  ...logRouter,
];
export default routerList;
